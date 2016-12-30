 public int trap(int[] height) {
		   
		   if(height.length == 0 || height.length == 1 || height.length == 2){
			   return 0;
		   }
		   
		   
		   int max = height[0];
		   boolean [][] watertrap;
		   int h = 0;
		   int startpos = 0;
		   int trappedwater = 0;
		   int addto = 0;
		   int k = 0;
		   
		   for(int i = 0;i < height.length; i++){
			   
			   if(height[i]>=max){
				   max = height[i];
			   }
			   
		   }
		   
		   watertrap = new boolean[max][height.length];
		   
		
		   for(int j = 0; j <height.length; j++){
			   
			    h = height[j];
			    startpos = max - 1;
			    
			    
			    while(h>0){
			    	
			    	watertrap[startpos][j] = true;
			    	startpos--;
			    	h--;
			    	
			    }
			   
		   }
		   
		
		   
		   for(int i = (max-1); i>=0 ; i--){
			   
			  
			   
			  while(k<watertrap[i].length){
				
				 
				   if(watertrap[i][k]==true){
					   
					   k++;
					 
					   
					   while(k < watertrap[i].length && watertrap[i][k]==false){
						   
						   addto++;
						   k++;
						   
						   System.out.println("addto is " + addto);
						  
						   
					   }
					   
					   //System.out.println("addto is " + addto);
					   
					   if(k == watertrap[i].length){
						   addto = 0;
					   }
					   
					   trappedwater += addto;
					   addto = 0;
					   
					   
				   }
				   
				   else{
					   k++;
				   }
				   
			  }
			  
			  k = 0;
			   
		   }
		   
	
		   
		   System.out.println(trappedwater);
		   return trappedwater;
		   
		   
	        
	    }
