public class IpAddress {
    static void main(String[] args) {

    }public String defangIPaddr(String address) {
        int s=0;
        int e=address.length()-1;
        while(s<=e){
            if(address.charAt(s) == '.'){
                s++;
            }else{
                s++;
            }
        }
        return address;
    }
}
