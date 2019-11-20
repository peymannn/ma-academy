package Library;

public class Book {
        private int id;
        private String title;
        private String author;
        private int year;
        private String publisher;
        private double price;

        public Book(String title,String author,int year,String publisher,double price)
        {
            id=createId();
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
            return " Id: "+ id + "\n " +"Title: " + title + "\n " + "Author: " + author + "\n " + "Year: " + year + "\n " + "Publisher: " + publisher + "\n " +"Price: " + price;
        }
        public int createId(){
            int newId = ((int)(Math.random() * 100));

            return newId;
        }
}
