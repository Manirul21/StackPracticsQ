public class Interface_implentation {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
        Rook R= new Rook();
        R.moves();

    }

}
interface ChessPlaye{
    void moves();
}
class Queen implements ChessPlaye{
    public void moves(){
        System.out.println("up,down,left,right, diagonal,all 4 dir");
    }
}
class Rook implements ChessPlaye{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlaye{
    public void moves(){
        System.out.println("up,down,left,right, diagonal,by 1 move");
    }
}
