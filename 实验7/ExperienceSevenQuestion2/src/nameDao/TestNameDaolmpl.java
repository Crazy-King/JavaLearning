package nameDao;

import java.util.List;

public class TestNameDaolmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameDaoImpl nameDaoImpl = new NameDaoImpl();
		String[] nameList = new String[]{"张三", "李四", "王五"};
		List<String> list = nameDaoImpl.getNameFromArray(nameList);
		System.out.println(nameDaoImpl.searchName(list, "张三"));
		try {
			System.out.println("Remove" + nameDaoImpl.removeFromList(list, 2));
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}

}
