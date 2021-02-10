package com.panini.s1;

public class Knight extends Character{
	
	private Weapon weapon;
	private Item item;


	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Knight() {
		super("iy"); // 이게 생략이 되어있는거
		
		//this() < 이것도 생성자라인의 제일 위에 있어야해서 둘 중 하나만 써야한다.
		// 같이 사용 불가.
		
	}
	
	public void prn() {
		
		System.out.println("super"+super.toString());
		System.out.println("This:"+this.toString());
		
	}
	
@Override
public void info() {
	// TODO Auto-generated method stub
	
}


}
