public class StringUtils{
    //arxikopoihsh
    int len;
    String myString;
    //o constractor
    StringUtils(String myString){
        this.myString = myString;
        len = this.myString.length();
    }
    int hamming(String tmp){
        //elegxo ean exoun to idio mhkos an oxi epistrefo -1
        if(this.len != tmp.length()) {
            return -1;
        }
        //ean exoun idio mhkos, elegxei poioi xaraktires einai diaforetikoi kai toys metraei sto counter.
        //sto telos to epistrefei
        else {
            int counter = 0;
            for (int i = 0; i < this.len; i++) {
                if (myString.charAt(i) != tmp.charAt(i))
                    counter += 1;
            }
            return counter;
        }
    }
    //auth h methodos pairnei to myString kai to antistrefei
    int reverseDistance(){
        String reversed = "";

        for (int i=0; i<len;i++)
            reversed =  myString.charAt(i) + reversed; //vazo enan xarakthra sthn arxi. meta pairno ton epomeno kai ton
                                                        //vazo piso apo ton prohgoymeno. px ean exo play vazo to p sto reversed
                                                        //meta sto reversed tha valo to "l" + to "p"
                                                        //meta reversed = "a" + "lp" klp

        return this.hamming(reversed);  //trexo kai epistrefo thn methodo hamming kai ths vazo orisma thn anestramenh myString
    }
}
