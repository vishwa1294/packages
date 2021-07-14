package com.xworkz.dp.message;

import java.io.Serializable;

public class MessageDTO implements Serializable {
	
	private int recieving;
	private boolean sending;
	private double deleting;
	private long dropbox;
	
	public MessageDTO ( int recieving, boolean sending,double deleting,long dropbox) {
		super();
		this.recieving=recieving;
		this.sending=sending;
		this .deleting= deleting;
		this.dropbox=dropbox;
		}

	public  MessageDTO () {
		System.out.println("Init  MessageDTO");
	}

	@Override
	public String toString() {
		System.out.println("Init   MessageDTO for tostring");
		return " MessageDTO[recieving =" + recieving + ",sending=" + sending + ",deleting=" + deleting + ",dropbox=" + dropbox+  "]";
	}

	
	public int getRecieving() {
		return recieving;
	}

	public void setRecieving(int recieving) {
		this.recieving = recieving;
	}

	
	public boolean isSending() {
		return sending;
	}

	
	public void setSending(boolean sending) {
		this.sending = sending;
	}

	
	public double getDeleting() {
		return deleting;
	}

	
	public void setDeleting(double deleting) {
		this.deleting = deleting;
	}

	
	public long getDropbox() {
		return dropbox;
	}

	
	public void setDropbox(long dropbox) {
		this.dropbox = dropbox;
	}
	
	

}
