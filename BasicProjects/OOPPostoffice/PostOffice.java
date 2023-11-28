public class PostOffice {
    private String name;

    public PostOffice(String name){
        this.name=name;
    }
    void send(Post post) {
        if (post.sourceAddress.equals(this.name)) {
            System.out.println("Gönderme işlemi gerçekleştirildi. Gönderilen mesaj: " + post.message);
        } else {
            System.out.println("Gönderme işlemi başarısız. Bu post ofisinden gönderilemez.");
        }
    }
    void recieve(Post post) {
        System.out.println("Alma işlemi gerçekleştirildi. Alınan mesaj: " + post.message);
    }
}