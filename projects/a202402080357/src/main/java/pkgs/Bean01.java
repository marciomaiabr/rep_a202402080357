package pkgs;

import java.io.Serializable;

public class Bean01 implements Serializable {

	private static final long serialVersionUID = 202402100430L;

	private int attr1;
	private Integer attr2;
	private String attr3;

	public Bean01() {
		System.out.println("Bean01.Bean01()");
	}

	public Bean01(int attr1, Integer attr2, String attr3) {
		super();
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
	}

	@Override
	public String toString() {
		return "Bean01 [attr1=" + attr1 + ", attr2=" + attr2 + ", attr3=" + attr3 + "]";
	}

	public int getAttr1() {
		return attr1;
	}

	public void setAttr1(int attr1) {
		this.attr1 = attr1;
	}

	public Integer getAttr2() {
		return attr2;
	}

	public void setAttr2(Integer attr2) {
		this.attr2 = attr2;
	}

	public String getAttr3() {
		return attr3;
	}

	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}

}
