import java.util.*;

public class AddressBooksHolder extends AddressBook {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of contacts you need to Add:");
        int MaxcountInput = scan.nextInt();
        HashMap<String, AddressBook> addressBookHolder = new HashMap<>();
        int count = 0;
        while (count != MaxcountInput) {
            scan.nextLine();
            System.out.println("Enter the Name for whom You need to create a contact : ");
            String name = scan.nextLine();
            AddressBook AddBook = new AddressBook();
            addressBookHolder.put(name, AddBook);
            getDetails(addressBookHolder, name);
            System.out.println("Showing Details of " + name + " : ");
            showDetails(AddBook);
            count++;
        }
        System.out.println("FNAME   LNAME   ADDRESS     CITY    STATE   PIN     PHNUMBR");
        addressBookHolder.forEach((k, v) -> System.out.println(k + ":" + v.getFirstName() + "    " + v.getLastName() + "     " + v.getAddress() + "     " + v.getCity() + "     " + v.getState() + "    " + v.getZip() + "      " + v.getPhoneNumber()));
        editDetails(addressBookHolder);
        System.out.println("---------------SORTED BY NAME ORDER------------------" );
        sortByName(addressBookHolder);
        System.out.println("---------------SORTED BY ZIP CODE ORDER---------------" );
        sortByZIP(addressBookHolder);
    }

    private static void editDetails(Map<String, AddressBook> HashMapObject) {
        System.out.print("Wanna Edit? If YES, Press Y for edit : ");
        char edit = scan.next().charAt(0);
        if (edit == 'Y' || edit == 'y') {
            System.out.println("Enter the Name for whom you need to edit :");
            String name = scan.nextLine();
            editContact(HashMapObject, name);
        }
    }

    private static void editContact(Map<String, AddressBook> HashMapObject, String name) {
        System.out.println("1.Address  2.City  3.State  4.ZIP Code  5.PhNumber");
        System.out.println("What You need to Edit ? Enter Your Choice : ");

        int choice = scan.nextInt();
        scan.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter the New Address : ");
                String newAddress = scan.nextLine();
                HashMapObject.get(name).setAddress(newAddress);
                System.out.println("NEW : " + HashMapObject.get(name).getAddress());
                System.out.println("Address is Updated..");
                break;
            case 2:
                System.out.println("Enter the New city : ");
                String newcity = scan.nextLine();
                HashMapObject.get(name).setAddress(newcity);
                System.out.println("NEW : " + HashMapObject.get(name).getCity());
                System.out.println("city is Updated..");
                break;
            case 3:
                System.out.println("Enter the New State : ");
                String newState = scan.nextLine();
                HashMapObject.get(name).setAddress(newState);
                System.out.println("NEW : " + HashMapObject.get(name).getState());
                System.out.println("state is Updated..");
                break;
            case 4:
                System.out.println("Enter the New PIN Code : ");
                String newPinCode = scan.nextLine();
                HashMapObject.get(name).setAddress(newPinCode);
                System.out.println("NEW : " + HashMapObject.get(name).getZip());
                System.out.println("PIN code is Updated..");
                break;
            case 5:
                System.out.println("Enter the New Number : ");
                String newPhNumber = scan.nextLine();
                HashMapObject.get(name).setAddress(newPhNumber);
                System.out.println("NEW : " + HashMapObject.get(name).getPhoneNumber());
                System.out.println("Contact Number is Updated..");
                break;
        }
    }

    private static void showDetails(AddressBook AddrBookObject) {
        System.out.println("FirstName is :  " + AddrBookObject.getFirstName());
        System.out.println("LastName is :  " + AddrBookObject.getLastName());
        System.out.println("Address is :  " + AddrBookObject.getAddress());
        System.out.println("city is :  " + AddrBookObject.getCity());
        System.out.println("state is :  " + AddrBookObject.getState());
        System.out.println("Pincode is :  " + AddrBookObject.getZip());
        System.out.println("Contact Number is :  " + AddrBookObject.getPhoneNumber());

    }

    public static void getDetails(Map<String, AddressBook> HashMapObject, String name) {
        System.out.println("Enter the First Name:");
        final String FirstName = scan.nextLine();
        HashMapObject.get(name).setFirstName(FirstName);
        System.out.println("Enter the Last Name:");
        final String LastName = scan.nextLine();
        HashMapObject.get(name).setLastName(LastName);
        System.out.println("Enter the Address :");
        String Address = scan.nextLine();
        HashMapObject.get(name).setAddress(Address);
        System.out.println("Enter the City:");
        String city = scan.nextLine();
        HashMapObject.get(name).setCity(city);
        System.out.println("Enter the State:");
        String state = scan.nextLine();
        HashMapObject.get(name).setState(state);
        System.out.println("Enter the Postal Code:");
        int pincode = scan.nextInt();
        HashMapObject.get(name).setZip(pincode);
        System.out.println("Enter the Contact Number:");
        long number = scan.nextLong();
        HashMapObject.get(name).setPhoneNumber(number);
    }

    private static void sortByName(Map<String, AddressBook> HashMapObject) {
        TreeMap<String, AddressBook> treemap = new TreeMap<>(HashMapObject);
        Set<Map.Entry<String, AddressBook>> sortedOrder=treemap.entrySet();
        System.out.println("KEY       FNAME   LNAME   ADDRESS     CITY    STATE   PIN     PHNUMBR");
        for(Map.Entry<String, AddressBook> sortOrder : sortedOrder){
            System.out.println(sortOrder.getKey() + "   ==>   " + sortOrder.getValue().getFirstName()+"     "+sortOrder.getValue().getLastName()+"     "+sortOrder.getValue().getAddress()+"     "+sortOrder.getValue().getCity()+"     "+sortOrder.getValue().getState()+"     "+sortOrder.getValue().getZip()+"     "+sortOrder.getValue().getPhoneNumber());
        }
    }

    private static void sortByZIP(Map<String, AddressBook> HashMapObject){
        Iterator itr = HashMapObject.entrySet().iterator();
        ArrayList<Integer> zipArrayList= new ArrayList<>();
        while(itr.hasNext()){
            Map.Entry hashMapContents=(Map.Entry)itr.next();
            String key = (String) hashMapContents.getKey();
            int zipcode = HashMapObject.get(key).getZip();
            zipArrayList.add(zipcode);
        }
        Collections.sort(zipArrayList);

        System.out.println("ZIPCODE       FNAME   LNAME   ADDRESS     CITY    STATE   PIN     PHNUMBR");

        Iterator Seconditr = HashMapObject.entrySet().iterator();
            while (Seconditr.hasNext()) {
                Map.Entry hashMapContents = (Map.Entry) Seconditr.next();
                for (Integer integer : zipArrayList) {
                    String key = (String) hashMapContents.getKey();
                    int zipcode = HashMapObject.get(key).getZip();
                    if (zipcode == integer)
                        System.out.println(HashMapObject.get(key).getZip() + "    ==>    " + HashMapObject.get(key).getFirstName() + "    " + HashMapObject.get(key).getLastName() + "     " + HashMapObject.get(key).getAddress() + "       " + HashMapObject.get(key).getCity() + "    " + HashMapObject.get(key).getState() + "       " + HashMapObject.get(key).getPhoneNumber());
            }
        }

    }

}