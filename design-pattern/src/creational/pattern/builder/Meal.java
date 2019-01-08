package creational.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/*
 * 点餐类，将点的东西加入列表
 */
public class Meal {
   private List<Item> items = new ArrayList<Item>();    
	 
   public void addItem(Item item){
      items.add(item);
   }
 
   public float getCost(){
      float cost = 0.0f;
      for (Item item : items) {
         cost += item.price();
      }        
      return cost;
   }
 
   public void showItems(){
	  double account = 0.0f;
      for (Item item : items) {
         System.out.print("Item : "+item.name());
         System.out.print(", Packing : "+item.packing().pack());
         System.out.println(", Price : "+item.price());
         account += item.price();
      }  
      System.out.print("Account : "+account);
   }    
}
