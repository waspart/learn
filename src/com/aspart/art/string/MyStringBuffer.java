package com.aspart.art.string;

public class MyStringBuffer implements IStringBuffer {

	private int capacity = 16;
	private int length = 0;
	private char[] value = new char[this.capacity];

	public MyStringBuffer() {
		this.value = new char[this.capacity];
	}

	public MyStringBuffer(int capacity) {
		// this.capacity = capacity
		this.value = new char[capacity];
	}

	public MyStringBuffer(String str) {
		if (str != null) {
			this.value = str.toCharArray();
		}
		this.length = value.length;
		if (this.capacity < value.length) {
			this.capacity = value.length;
		}
	}

	@Override
	public void append(String str) {
		int len_str = str.length();
		char[] val_new;
		// System.out.println("str length: " + len_str);
		if (this.value.length + len_str > this.capacity) {
			this.capacity = this.value.length + len_str;
			val_new = new char[this.value.length + len_str];
		} else {
			val_new = new char[this.value.length + len_str];
		}
		char[] val_str = str.toCharArray();
		// val_new = new char[this.capacity];
		// System.out.println(val_new.length);
		for (int i = 0; i < this.value.length; i++) {
			val_new[i] = this.value[i];
		}
		for (int i = this.value.length; i < val_new.length; i++) {
			val_new[i] = val_str[i - this.value.length];
		}
		this.value = val_new;
	}

	@Override
	public void append(char c) {
//		System.out.println(this.capacity - this.value.length);
		char[] val_new = new char[this.value.length+1];
//		System.out.println(val_new.length);
		for (int i = 0; i < this.value.length; i++) {
			val_new[i] = this.value[i];
		}
		val_new[val_new.length - 1] = c;
		this.value = val_new;
	}

	@Override
	public void insert(int pos, char b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(int pos, String b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int start) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int start, int end) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reverse() {

		for (int i = 0; i < this.value.length / 2; i++) {
			char ch = this.value[i];
			// System.out.println(this.value.length - i - 1);
			this.value[i] = this.value[this.value.length - i - 1];
			this.value[this.value.length - i - 1] = ch;

		}

	}

	@Override
	public int length() {
		return this.value.length;
	}

	public String toString() {
		return new String(this.value);
	}

	public static void main(String[] args) {
		MyStringBuffer msb = new MyStringBuffer("abcde");
		System.out.println("反转前：" + msb.toString());
		System.out.println(msb.value.length);
		// msb.reverse();
		// System.out.println("反转后：" + msb.toString());
		msb.append("fghi");
		System.out.println(msb.toString());
		System.out.println(msb.value.length);

		msb.append('k');
		System.out.println(msb.toString());
		System.out.println(msb.value.length);
	}

}
