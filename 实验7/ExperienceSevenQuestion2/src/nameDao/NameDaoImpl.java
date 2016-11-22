package nameDao;

import java.util.*;

public class NameDaoImpl implements NameDao{

	@Override
	public List<String> getNameFromArray(String[] names) {
		List<String> list = Arrays.asList(names);

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		return list;
	}

	@Override
	public int searchName(List<String> nameList, String name) {
		// TODO Auto-generated method stub
		int index = 0;
		for (String nameT : nameList) {
			index++;
			if (nameT.equals(name)) {
				return index;
			}
		}
		return -1;
	}

	@Override
	public boolean removeFromList(List<String> nameList, int id) throws Exception{
		// TODO Auto-generated method stub
		try {
			nameList.remove(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("IllegaArgumentException");
		}
	}

}
