public class PostOfficeTest {
    public static void main(String[] args){

        PostOffice office1=new PostOffice("Ankara");
        PostOffice office2=new PostOffice("İstabul");
        Post post1=new Post("Hello","Ankara","İstanbul");
        office1.send(post1);
        office2.recieve(post1);
    }
}
