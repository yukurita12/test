
public class Test {
	public static void main (String[] args) {
		TestUserDAO dao = new TestUserDAO();
		dao.selectAll();
		dao.updateUserNameByUserName("taro", "saburo");
		dao.insert(4, "shiro", "012");
		dao.delete("jiro");
		dao.delete("shiro");
		dao.insert(4, "shiro", "012");
	}

}
