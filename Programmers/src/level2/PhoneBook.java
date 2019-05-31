class PhoneBook {
    public boolean solution(String[] phone_book) {
        String temp = "";
        
        for(int i=0; i<phone_book.length-1; i++){
            for(int j=1; j<phone_book.length; j++){
                if(phone_book[i].length() > phone_book[j].length()){
                    temp = phone_book[i].substring(0, phone_book[j].length());
                    if(temp.equals(phone_book[j])){
                        return false;
                    }
                }else if(phone_book[i].length() < phone_book[j].length()){
                    temp = phone_book[j].substring(0, phone_book[i].length());
                    if(temp.equals(phone_book[i])){
                        return false;
                    }
                }
                temp = "";
            }
        }
        return true;
    }
}