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
        private static int hash(int key){
            return key % size;
        }
        public void insect(int item){
            int index=hash(item);
            while(table[index]!=-1){
                index =(index +1)% size;

            }
            table[index]=item;



        }
        public static boolean search(int[]table,int item,int key){
            int index=hash(key);
            while(table[index]!=-1){
                if(table[index]==item){
                    return true;
                }
                index=(index +1)%size;

            }
            return false;

        }
        public void display(){
            for(int i=0;i<size;i++){
                if(table[i]==-1){
                    System.out.println(i);

                }else if(table[i]==-2){
                    System.out.println(i);

                }else{
                    System.out.println(table[1]);
                }
            }
        }


    }
}
