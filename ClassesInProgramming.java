public class Product {
  
   private int stockNumber;
   private double price;
  
   public Product(int stockNumber, double price)
   {
       this.stockNumber = stockNumber;
       this.price = price;
   }
  
   public void setStockNumber(int stockNumber)
   {
       this.stockNumber = stockNumber;
   }
  
   public void setPrice(double price)
   {
       this.price = price;
   }
  
   public int getStockNumber()
   {
       return this.stockNumber;
   }
  
   public double getPrice()
   {
       return this.price;
   }
   public static void main(String[] args) {

       Product newProduct = new Product(289856215, 129.99);

       System.out.println("Product: Car Seat ");
       System.out.println("Number in Stock:  " + newProduct.getStockNumber());
       System.out.println("Price: $" + newProduct.getPrice());
   }
}