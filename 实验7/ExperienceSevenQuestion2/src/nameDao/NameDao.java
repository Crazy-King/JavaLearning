package nameDao;

import java.util.*;

public interface NameDao{
	// 将数组中的字符串放入列表，该方法需要使用 Iterator 接口实现 
	public List<String> getNameFromArray(String[] names);
	// 在列表中搜索到与 name 相同的项目，就返回该 name 所在的序号，找不到返回 - 1。
	public int searchName(List<String> nameList, String name);
	// 根据指定 id，从列表中移除指定的项目，如果 id 指定错误 (负数或者超出列表最大值) 抛出 IllegaArgumentException 异常，移除成功返回 true
	public boolean removeFromList(List<String> nameList, int id) throws Exception;
}
