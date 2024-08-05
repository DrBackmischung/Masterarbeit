public class Node {
    public String id;
    public String content;
    public String parentId;
    public ArrayList<String> children;
  
    public Node(String id, String content, String parentId) {
        this.id = id;
        this.content = content;
        this.parentId = parentId;
        this.children = new ArrayList<String>();		
    }
  
    public Node(String id, String content, ArrayList<String> children) {
        this.id = id;
        this.content = content;
        this.parentId = "";
        this.children = children;
    }
  
    @Override
    public String toString() {
        return "Node [id=" + id + ", content=" + content + ", parentId=" + parentId + ", children=" + children + "]";
    }
}