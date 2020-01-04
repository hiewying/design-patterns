package kerryvending;


class vendingExample
{
	// add coins
	public int drop(String coins, int total)
	{
	
		if(coins.equals("NICKEL")){
			total = total + Coin.NICKEL.getDenom();
		}else if(coins.equals("DIME")){
			total = total + Coin.DIME.getDenom();
		}else if(coins.equals("QUARTER")){
			total = total + Coin.QUARTER.getDenom();
		}else if(coins.equals("DOLLAR")){
			total = total + Coin.DOLLAR.getDenom();
		}else{
			System.out.println("Wrong Input Coin");
		}
	
		return total;
	}

	
	//select items
	public int choose(String sample, int total)
	{
		if(sample.equals("PEPSI")){
			System.out.println("You have selected "+Item.PEPSI.getName());
			if(total>=Item.PEPSI.getPrice()){
				total = total - Item.PEPSI.getPrice();
				System.out.println("Thank you for your purchase!! ");
				System.out.println("Your balance is "+total);
			}else{
				System.out.println("Insert more coins ");
				return 2;
			}
			
		}else if(sample.equals("COFFEE")){
			System.out.println("You have selected "+Item.COFFEE.getName());
			if(total>=Item.COFFEE.getPrice()){
				total = total - Item.COFFEE.getPrice();
				System.out.println("Thank you for your purchase!! ");
				System.out.println("Your balance is "+total);
			}else{
				System.out.println("Insert more coins ");
				return 2;
			}
		}else if(sample.equals("TEA")){
			System.out.println("You have selected "+Item.TEA.getName());
			if(total>=Item.TEA.getPrice()){
				total = total - Item.TEA.getPrice();
				System.out.println("Thank you for your purchase!! ");
				System.out.println("Your balance is "+total);
			}else{
				System.out.println("Insert more coins ");
				return 2;
			}
		}else if(sample.equals("RETURN")){
			System.out.println("Your balance is "+total+" and is returned.");
			return 1;
		}else if(sample.equals("CANCEL")){
			return -1;
		}else{
			System.out.println("Wrong choice: Your balance is "+total);
			return 1;
		}
	
		return total;
	}
}