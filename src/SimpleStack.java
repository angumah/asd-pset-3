public class SimpleStack {
    private String[] mainStack;
    private int size;
    public SimpleStack(){
        mainStack = new String[0];
        size = mainStack.length;
    }
    public boolean empty(){
        if(size != 0){
            return false;
        }
        return true;
    }
    public String peek(){
        return mainStack[0];
    }
    public String pop(){
        String removedString = mainStack[0];
        String[] tempArray = new String[size];
        for(int i = 0; i < tempArray.length;  i++){
            tempArray[i] = mainStack[i];
        }
        size--;
        mainStack = new String[size];
        for(int i = 0; i < size;  i++){
            mainStack[i] = tempArray[i+1];
        }
        return removedString;
    }
    public String push(String s){
        String[] tempArray = new String[size];
        for(int i = 0; i < size;  i++){
            tempArray[i] = mainStack[i];
        }
        size++;
        mainStack = new String[size];
        mainStack[0] = s;
        for(int i = 1; i < size; i++){
            mainStack[i] = tempArray[i-1];
        }

        return s;
    }
    public int search(String s){
        int index = 0;
        String searchString = s;
        boolean notFound = true;
        for(int i = 0; i < size; i++){
            if(notFound){
                if(mainStack[i].equals(s)){
                    return index+1;
                }
            }
            index++;
        }

        return -1;
    }
    public String toString() {
        String convert = "";
        String addElement;
        for(int i = 0; i < size ; i++){
            if(i == 0){
               addElement =  mainStack[i];
            }else {
                addElement = mainStack[i] + ", ";
            }
                convert = addElement + convert;
        }
        return "[" + convert + "]";
    }

}
