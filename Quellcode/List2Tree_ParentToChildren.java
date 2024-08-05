public class List2TreeByParents {
	
    public static void main(String[] args) {
        
        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(new Node("SHOP_SRV", "Service Binding", ""));
        nodes.add(new Node("SHOP_SD", "Service Definition", "SHOP_SRV"));
        nodes.add(new Node("D_SHOP_C", "Data Definition Consumption", "SHOP_SD"));
        nodes.add(new Node("B_SHOP_C", "Behaviour Definition Consumption", "D_SHOP_C"));
        nodes.add(new Node("D_SHOP_I", "Data Definition Interface", "D_SHOP_C"));
        nodes.add(new Node("B_SHOP_I", "Behaviour Definition Interface", "D_SHOP_I"));
        nodes.add(new Node("C_SHOP", "Behaviour Implementation", "B_SHOP_I"));
        nodes.add(new Node("CX_SHOP", "Behaviour Implementation Exception", "C_SHOP"));
        nodes.add(new Node("M_SHOP", "Behaviour Implementation Exception Texts", "CX_SHOP"));
        nodes.add(new Node("DB_SHOP", "Database", "D_SHOP_I"));
        nodes.add(new Node("DO_ID", "Dictionary: ID", "DB_SHOP"));
        nodes.add(new Node("DO_Name", "Dictionary: Name", "DB_SHOP"));
        nodes.add(new Node("DO_Product", "Dictionary: Product", "DB_SHOP"));
        nodes.add(new Node("DO_Price", "Dictionary: Price", "DB_SHOP"));
        
        HashMap<String, Node> map = new HashMap<>();
        for(Node n : nodes) {
            map.put(n.id, n);
        }
        
        for(Node n : nodes) {
            if(!n.parentId.equals("")) {
                map.get(n.parentId).children.add(n.id);
            }
        }
        
        Set<Entry<String, Node>> objects = map.entrySet();
        
        for(Entry<String, Node> e : objects) {
            System.out.println("ID: "+e.getKey()+", Parent: "+e.getValue().parentId+", Children: "+e.getValue().children);
        }
        
    }
	
}