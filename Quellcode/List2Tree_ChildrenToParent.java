public class List2TreeByChildren {
	
    public static void main(String[] args) {
        
        ArrayList<Node> nodes = new ArrayList<>();
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("SHOP_SD");
        nodes.add(new Node("SHOP_SRV", "Service Binding", list1));
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("D_SHOP_C");
        nodes.add(new Node("SHOP_SD", "Service Definition", list2));
        
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("B_SHOP_C");
        list3.add("D_SHOP_I");
        nodes.add(new Node("D_SHOP_C", "Data Definition Consumption", list3));
        
        ArrayList<String> list4 = new ArrayList<>();
        nodes.add(new Node("B_SHOP_C", "Behaviour Definition Consumption", list4));
        
        ArrayList<String> list5 = new ArrayList<>();
        list5.add("B_SHOP_I");
        list5.add("DB_SHOP");
        nodes.add(new Node("D_SHOP_I", "Data Definition Interface", list5));
        
        ArrayList<String> list6 = new ArrayList<>();
        list6.add("C_SHOP");
        nodes.add(new Node("B_SHOP_I", "Behaviour Definition Interface", list6));
        
        ArrayList<String> list7 = new ArrayList<>();
        list7.add("CX_SHOP");
        nodes.add(new Node("C_SHOP", "Behaviour Implementation", list7));
        
        ArrayList<String> list8 = new ArrayList<>();
        list8.add("M_SHOP");
        nodes.add(new Node("CX_SHOP", "Behaviour Implementation Exception", list8));
        
        ArrayList<String> list9 = new ArrayList<>();
        nodes.add(new Node("M_SHOP", "Behaviour Implementation Exception Texts", list9));
        
        ArrayList<String> list10 = new ArrayList<>();
        list10.add("DO_ID");
        list10.add("DO_Name");
        list10.add("DO_Product");
        list10.add("DO_Price");
        nodes.add(new Node("DB_SHOP", "Database", list10));
        
        ArrayList<String> list11 = new ArrayList<>();
        nodes.add(new Node("DO_ID", "Dictionary: ID", list11));
        
        ArrayList<String> list12 = new ArrayList<>();
        nodes.add(new Node("DO_Name", "Dictionary: Name", list12));
        
        ArrayList<String> list13 = new ArrayList<>();
        nodes.add(new Node("DO_Product", "Dictionary: Product", list13));
        
        ArrayList<String> list14 = new ArrayList<>();
        nodes.add(new Node("DO_Price", "Dictionary: Price", list14));
        
        HashMap<String, Node> map = new HashMap<>();
        for(Node n : nodes) {
            map.put(n.id, n);
        }
        
        for(Node n : nodes) {
            if(n.children.size() != 0) {
                ArrayList<String> children = map.get(n.id).children;
                for(String c : children) {
                    map.get(c).parentId = n.id;
                }
            }
        }
        
        Set<Entry<String, Node>> objects = map.entrySet();
        
        for(Entry<String, Node> e : objects) {
            System.out.println("ID: "+e.getKey()+", Parent: "+e.getValue().parentId+", Children: "+e.getValue().children);
        }
        
    }
	
}