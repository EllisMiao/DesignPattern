package com.mxh.design.demo7;
/**
 * 门面
 * @author S
 *
 */
public class Computer {

	private Cpu cpu;
	private Disk disk;
	private Memory memory;
	
	public Computer(){
		cpu = new Cpu();
		disk = new Disk();
		memory = new Memory();
	}
	
	public void start(){
		System.out.println("电脑开机");
		cpu.turnOn();
		disk.turnOn();
		memory.turnOn();
	}
	
	public void close(){
		System.out.println("电脑关机");
		cpu.turnOff();
		disk.turnOff();
		memory.turnOff();
	}
}
