function AddFavorite(url, sitename) {
    var url = window.location;
    var sitename = document.title;
    if (document.all) {
        window.external.AddFavorite(url, sitename);
    }
    else if (window.sidebar) {
        window.sidebar.addPanel(sitename, url, "");
    }
}
//��Ϊ��ҳ
function SetHome(obj,vrl)
{
	try
	{
			obj.style.behavior='url(#default#homepage)';obj.setHomePage(vrl);
	}
	catch(e){
			if(window.netscape) {
					try {
							netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");
					}
					catch (e) {
							alert("�˲�����������ܾ���\n�����������ַ�����롰about:config�����س�\nȻ��[signed.applets.codebase_principal_support]����Ϊ'true'");
					}
					var prefs = Components.classes['@mozilla.org/preferences-service;1'].getService(Components.interfaces.nsIPrefBranch);
					prefs.setCharPref('browser.startup.homepage',vrl);
			 }
	}
}
//ˢ��ҳ��
function reload() {
	window.location.reload();
}