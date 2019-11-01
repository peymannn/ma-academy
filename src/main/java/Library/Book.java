package Library;

public class Book {


        private int ID;
        private String title;
        private String author;
        private int year;
        private String publisher;
        private double cost;

        public Book(int ID,String title,String author,int year,String publisher,double cost)
        {
            this.ID=ID;
            this.title=title;
            this.author=author;
            this.year=year;
            this.publisher=publisher;
            this.cost=cost;
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
        public double getCost()
        {
            return cost;
        }
       public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
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
        public void setCost(double cost)
        {
            this.cost=cost;
        }
        public String AllDatetoString()
        {
            return "Başlık: " + title + "\n " +"Yazar: "+ author +"\n " +"Yıl: "+ year + "\n " +"Yayın Evi:"+ publisher +"\n " +"Fiyat" + cost;
        }

}
