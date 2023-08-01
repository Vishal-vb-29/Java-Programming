public class interfaces {
    public static void main(String args[]){
// It doesn't work because SmallBanana is an inner class of Test and since it isn't a static inner class ,you main() can't access it directly ,you can either mark SmallBananaas static or use
        interfaces t = new interfaces();
        Queen q=t.new Queen();
        q.moves(); 
    }
    
    interface ChessPlayer{
        void moves();
    }
    class Queen implements ChessPlayer{
        public void moves(){
            System.out.println("TOP - BOTTOM - LEFT - RIGHT & DIAGONAL(in all 4 direction)");
        }
    }
    class Rook implements ChessPlayer{
        public void moves(){
            System.out.println("TOP - BOTTOM - LEFT - RIGHT");
        }
    }
    class King implements ChessPlayer{
        public void moves(){
            System.out.println("TOP - BOTTOM - LEFT - RIGHT & DIAGONAL(only 1 step)");
        }
    }

    
}
