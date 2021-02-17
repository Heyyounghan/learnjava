package com.iu.s1.utill.list;

import java.util.ArrayList;

public class ArrayList_3 {
	public static void main(String[] args) {
		WorkerEmart we= new WorkerEmart();
		WorkerHomeplus wh = new WorkerHomeplus();

		ArrayList<Worker> work = new ArrayList<>();

		work.add(we);
		work.add(wh);
		
		for(int i=0; i<work.size(); i++) {
			Worker w= work.get(i);
			w.doIt();
			
			if(w instanceof WorkerHomeplus) {
				WorkerHomeplus wh2= (WorkerHomeplus)w;
				System.out.println(wh2.toy);
			}


		}




	}

}
