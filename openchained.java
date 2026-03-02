public class openchained{
    static class openhash{
        String[] table;
        int size;
        public void openchained(int size){
            this.size=size;
            table= new String[size];

            for(int i=0;i<size;i++){
                table[i]=-1;
            }
        }


    }
}
