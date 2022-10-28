class Product
{
String productId;
String productName;
double price;
int availableQuantity;

public Product(String w,String x,double y,int z)
{
this.productId=w;
this.productName=x;
this.price=y;
this.availableQuantity=z;
}
void setProductId(String i)
{
productId=i;
}
String getProductId( )
{
return productId;
}
void setProductName(String j)
{
productName=j;
}
String getProductName( )
{
return productName;
}
void setPrice(double k)
{
price=k;
}
double getPrice( )
{
return price;
}
void setAvailableQuantity(int a)
{
availableQuantity=a;
}
int getAvailableQuantity( )
{
return availableQuantity;
}
void showDetails( )
{
System.out.println("Product Id:"+productId);
System.out.println("Product Name:"+productName);
System.out.println("Price:"+price);
System.out.println("Available Quantity:"+availableQuantity);
}
}
