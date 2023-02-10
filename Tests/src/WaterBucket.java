
public class WaterBucket {
		
		private int gallonsofwater;
		private boolean empty;
		private int Waterbucket;
		private int capacity;
		private int amount;
		
		public boolean isEmpty(boolean empty) {
			if (gallonsofwater == 0)
				return true;
			else
				return false;
		}
		
		public boolean makeEmpty() {
			return empty;
		}
		
		public int setAmount() {
			return amount;
		}
		
		public void getAmount() {
			this.amount = amount;
		}
		public int setCapacity() {
			return capacity;
		}
		
		public void getCapacity() {
			this.capacity = capacity;
		}
		
		public int addWater(int a) {
			if (a + amount < 100)
				return a + amount;
			else
				return 100;
		}
		
		public int greaterThan(WaterBucket b) {
			if (Waterbucket < b.amount)
				return -1;
			else if (Waterbucket > b.amount)
				return 1;
			else
				return 0;
		}
		

	}


