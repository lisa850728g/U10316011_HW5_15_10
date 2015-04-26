import java.util.*;

/**此類別實作Cloneable
 * 在ArrayList類別下建物件
 * 運用ArrayList裡的方法
 * 還有運用Object類別裡的clone方法
 */
class MyStack implements Cloneable{
	//new an object in ArrayList<Object>
	public ArrayList<Object> list = new ArrayList<Object>();
	
	//判斷陣列是否為空
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	//判斷陣列的大小
	public int getSize(){
		return list.size();
	}
	
	//拿出陣列中的內容物
	public Object peek(){
		return  list.get(getSize()-1);
	}

	//拿出陣列中的內容物，儲存在一個變數，最後移除它
	public Object pop(){
		Object o = list.get(getSize()-1);
		list.remove(getSize()-1);
		return o;
	}
	
	//加東西進入陣列
	public void push(Object o){
		list.add(o);
	}
	
	//物件拷貝的方法
	//呼叫Object類別裡的clone method，並且轉型進MyStack
	//讓ArrayList的物件可以使用
	@SuppressWarnings("unchecked")
	public  Object clone() throws CloneNotSupportedException{
		MyStack stackClone = (MyStack)super.clone();
		stackClone.list = (ArrayList<Object>)(list.clone());
		return stackClone;
	}
	
	//toString method	
	@Override
	public String toString(){
		return "stack: " + list.toString();
	}
}
