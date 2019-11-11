package Library;

public class Book {


        private int id;
        private String title;
        private String author;
        private int year;
        private String publisher;
        private double price;

        public Book(int id,String title,String author,int year,String publisher,double price)
        {
            this.id =id;
            this.title=title;
            this.author=author;
            this.year=year;
            this.publisher=publisher;
            this.price =price;
        }

        public String getTitle()
        {
            return title;
        }

        public String getAuthor()
        {
            return author;
        }
        public int getYear()
        {
            return year;
        }
        public String getPublisher()
        {
            return publisher;
        }
        public double getPrice()
        {
            return price;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public void setTitle(String title)
        {
            this.title=title;
        }
        public void setAuthor(String author)
        {
            this.author=author;
        }
        public void setYear(int year)
        {
            this.year=year;
        }
        public void setPublisher(String publisher)
        {
            this.publisher=publisher;
        }
        public void setPrice(double price)
        {
            this.price = price;
        }
        public String AllDatatoString()
        {
            return "Title: " + title + "\n " +"Author: "+ author +"\n " +"Year: "+ year + "\n " +"Publisher:"+ publisher +"\n " +"Price" + price;
        }

}
