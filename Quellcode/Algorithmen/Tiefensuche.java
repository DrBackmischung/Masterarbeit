package com.sap.mathisneunzig.algorithms;

import java.util.*;
import com.sap.mathisneunzig.tree.List2TreeByParents;
import com.sap.mathisneunzig.tree.Node;

public class Tiefensuche {
	
	static ArrayList<Node> result = new ArrayList<>();
	
	public static void main(String[] args) {
		
		start();
		
	}
	
	public static void start() {


		System.out.println();
		System.out.println("=====================[DFS (iterativ, preorder)]=====================");
		System.out.println();
		HashMap<String, Node> map = List2TreeByParents.getMapMiddle();
		result = new ArrayList<>();
		iterativPreOrder(map, "SB_CFD_PRJ_PROJECT_V4", "cfd_dummy");
		System.out.println();
		System.out.println("=====================[ResultSet DFS (iterativ, preorder)]=====================");
		System.out.println();
		for(Node s : result) {
			System.out.println(s.id +" (DB: "+s.parentId+")");
		}

		System.out.println();
		System.out.println("=====================[DFS (iterativ, postorder)]=====================");
		System.out.println();
		map = List2TreeByParents.getMapMiddle();
		result = new ArrayList<>();
		iterativPostOrder(map, "SB_CFD_PRJ_PROJECT_V4", "cfd_dummy");
		System.out.println();
		System.out.println("=====================[ResultSet DFS (iterativ, postorder)]=====================");
		System.out.println();
		for(Node s : result) {
			System.out.println(s.id +" (DB: "+s.parentId+")");
		}

		System.out.println();
		System.out.println("=====================[DFS (rekursiv, preorder)]=====================");
		System.out.println();
		map = List2TreeByParents.getMapMiddle();
		result = new ArrayList<>();
		rekursivPreOrder(map, "SB_CFD_PRJ_PROJECT_V4", "cfd_dummy");
		System.out.println();
		System.out.println("=====================[ResultSet DFS (rekursiv, preorder)]=====================");
		System.out.println();
		for(Node s : result) {
			System.out.println(s.id +" (DB: "+s.parentId+")");
		}

		System.out.println();
		System.out.println("=====================[DFS (rekursiv, postorder)]=====================");
		System.out.println();
		map = List2TreeByParents.getMapMiddle();
		result = new ArrayList<>();
		rekursivPostOrder(map, "SB_CFD_PRJ_PROJECT_V4", "cfd_dummy");
		System.out.println();
		System.out.println("=====================[ResultSet DFS (rekursiv, postorder)]=====================");
		System.out.println();
		for(Node s : result) {
			System.out.println(s.id +" (DB: "+s.parentId+")");
		}

		System.out.println();
		System.out.println("=====================[DFS (beschränkt, iterativ, preorder)]=====================");
		System.out.println();
		map = List2TreeByParents.getMapMiddle();
		result = new ArrayList<>();
		beschraenktIterativPreOrder(map, "SB_CFD_PRJ_PROJECT_V4", "cfd_dummy", 3);
		System.out.println();
		System.out.println("=====================[ResultSet DFS (beschränkt, iterativ, preorder)]=====================");
		System.out.println();
		for(Node s : result) {
			System.out.println(s.id +" (DB: "+s.parentId+")");
		}

		System.out.println();
		System.out.println("=====================[DFS (beschränkt, iterativ, postorder)]=====================");
		System.out.println();
		map = List2TreeByParents.getMapMiddle();
		result = new ArrayList<>();
		beschraenktIterativPostOrder(map, "SB_CFD_PRJ_PROJECT_V4", "cfd_dummy", 3);
		System.out.println();
		System.out.println("=====================[ResultSet DFS (beschränkt, iterativ, postorder)]=====================");
		System.out.println();
		for(Node s : result) {
			System.out.println(s.id +" (DB: "+s.parentId+")");
		}


		System.out.println();
		System.out.println("=====================[DFS (nicht-deterministisch, iterativ, preorder)]=====================");
		System.out.println();
		map = List2TreeByParents.getMapMiddle();
		result = new ArrayList<>();
		nichtDeterministischIterativPreOrder(map, "SB_CFD_PRJ_PROJECT_V4", "cfd_dummy");
		System.out.println();
		System.out.println("=====================[ResultSet DFS (nicht-deterministisch, iterativ, preorder)]=====================");
		System.out.println();
		for(Node s : result) {
			System.out.println(s.id +" (DB: "+s.parentId+")");
		}

		System.out.println();
		System.out.println("=====================[DFS (nicht-deterministisch, iterativ, postorder)]=====================");
		System.out.println();
		map = List2TreeByParents.getMapMiddle();
		result = new ArrayList<>();
		nichtDeterministischIterativPostOrder(map, "SB_CFD_PRJ_PROJECT_V4", "cfd_dummy");
		System.out.println();
		System.out.println("=====================[ResultSet DFS (nicht-deterministisch, iterativ, postorder)]=====================");
		System.out.println();
		for(Node s : result) {
			System.out.println(s.id +" (DB: "+s.parentId+")");
		}

		System.out.println();
		System.out.println("=====================[DFS (nicht-deterministisch, rekursiv, preorder)]=====================");
		System.out.println();
		map = List2TreeByParents.getMapMiddle();
		result = new ArrayList<>();
		nichtDeterministischRekursivPreOrder(map, "SB_CFD_PRJ_PROJECT_V4", "cfd_dummy");
		System.out.println();
		System.out.println("=====================[ResultSet DFS (nicht-deterministisch, rekursiv, preorder)]=====================");
		System.out.println();
		for(Node s : result) {
			System.out.println(s.id +" (DB: "+s.parentId+")");
		}

		System.out.println();
		System.out.println("=====================[DFS (nicht-deterministisch, rekursiv, postorder)]=====================");
		System.out.println();
		map = List2TreeByParents.getMapMiddle();
		result = new ArrayList<>();
		nichtDeterministischRekursivPostOrder(map, "SB_CFD_PRJ_PROJECT_V4", "cfd_dummy");
		System.out.println();
		System.out.println("=====================[ResultSet DFS (nicht-deterministisch, rekursiv, postorder)]=====================");
		System.out.println();
		for(Node s : result) {
			System.out.println(s.id +" (DB: "+s.parentId+")");
		}
		
	}
	
	public static void iterativPreOrder(HashMap<String, Node> map, String s, String suche) {
		
		Node start = map.get(s);
		if(start.content.contains(suche)) {
			result.add(start);
		}
		for(String c : start.children) {
			Node n = map.get(c);
			if(n.content.contains(suche)) {
				result.add(n);
			}
			for(String c2 : n.children) {
				Node n2 = map.get(c2);
				if(n2.content.contains(suche)) {
					result.add(n2);
				}
				for(String c3 : n2.children) {
					Node n3 = map.get(c3);
					if(n3.content.contains(suche)) {
						result.add(n3);
					}
					for(String c4 : n3.children) {
						Node n4 = map.get(c4);
						if(n4.content.contains(suche)) {
							result.add(n4);
						}
						for(String c5 : n4.children) {
							Node n5 = map.get(c5);
							if(n5.content.contains(suche)) {
								result.add(n5);
							}
							for(String c6 : n5.children) {
								Node n6 = map.get(c6);
								if(n6.content.contains(suche)) {
									result.add(n6);
								}
								for(String c7 : n6.children) {
									Node n7 = map.get(c7);
									if(n7.content.contains(suche)) {
										result.add(n7);
									}
									for(String c8 : n7.children) {
										Node n8 = map.get(c8);
										if(n8.content.contains(suche)) {
											result.add(n8);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
	}
	
	public static void iterativPostOrder(HashMap<String, Node> map, String s, String suche) {
		
		Node start = map.get(s);
		for(String c : start.children) {
			Node n = map.get(c);
			for(String c2 : n.children) {
				Node n2 = map.get(c2);
				for(String c3 : n2.children) {
					Node n3 = map.get(c3);
					for(String c4 : n3.children) {
						Node n4 = map.get(c4);
						for(String c5 : n4.children) {
							Node n5 = map.get(c5);
							for(String c6 : n5.children) {
								Node n6 = map.get(c6);
								for(String c7 : n6.children) {
									Node n7 = map.get(c7);
									for(String c8 : n7.children) {
										Node n8 = map.get(c8);
										if(n8.content.contains(suche)) {
											result.add(n8);
										}
									}
									if(n7.content.contains(suche)) {
										result.add(n7);
									}
								}
								if(n6.content.contains(suche)) {
									result.add(n6);
								}
							}
							if(n5.content.contains(suche)) {
								result.add(n5);
							}
						}
						if(n4.content.contains(suche)) {
							result.add(n4);
						}
					}
					if(n3.content.contains(suche)) {
						result.add(n3);
					}
				}
				if(n2.content.contains(suche)) {
					result.add(n2);
				}
			}
			if(n.content.contains(suche)) {
				result.add(n);
			}
		}
		if(start.content.contains(suche)) {
			result.add(start);
		}
		
	}
	
	public static void rekursivPreOrder(HashMap<String, Node> map, String s, String suche) {
		
		Node start = map.get(s);
		Deque<Node> st = new ArrayDeque<>();
		st.push(start);
		rekursivPreOrder_alg(st, map, suche);
		
	}
	
	private static void rekursivPreOrder_alg(Deque<Node> s, HashMap<String, Node> map, String suche) {

		if(s.isEmpty())
			return;
		
		Node n = (Node) s.pop();
		if(n.content.contains(suche)) {
			result.add(n);
		}
		for(String c : n.children) {
			s.push(map.get(c));
		}
		
		rekursivPreOrder_alg(s, map, suche);
		
	}
	
	public static void rekursivPostOrder(HashMap<String, Node> map, String s, String suche) {
		
		Node start = map.get(s);
		Deque<Node> st = new ArrayDeque<>();
		st.push(start);
		rekursivPostOrder_alg(st, map, suche);
		
	}
	
	private static void rekursivPostOrder_alg(Deque<Node> s, HashMap<String, Node> map, String suche) {

		if(s.isEmpty())
			return;
		
		Node n = (Node) s.pop();
		for(String c : n.children) {
			s.push(map.get(c));
		}
		
		rekursivPostOrder_alg(s, map, suche);
		
		if(n.content.contains(suche)) {
			result.add(n);
		}
		
	}
	
	public static void beschraenktIterativPreOrder(HashMap<String, Node> map, String s, String suche, int i) {
		
		Node start = map.get(s);
		if(start.content.contains(suche)) {
			result.add(start);
		}
		for(String c : start.children) {
			Node n = map.get(c);
			if(n.content.contains(suche)) {
				result.add(n);
			}
			for(String c2 : n.children) {
				Node n2 = map.get(c2);
				if(n2.content.contains(suche)) {
					result.add(n2);
				}
				for(String c3 : n2.children) {
					Node n3 = map.get(c3);
					if(n3.content.contains(suche)) {
						result.add(n3);
					}
					for(String c4 : n3.children) {
						Node n4 = map.get(c4);
						if(n4.content.contains(suche)) {
							result.add(n4);
						}
						for(String c5 : n4.children) {
							Node n5 = map.get(c5);
							if(n5.content.contains(suche)) {
								result.add(n5);
							}
							for(String c6 : n5.children) {
								Node n6 = map.get(c6);
								if(n6.content.contains(suche)) {
									result.add(n6);
								}
							}
						}
					}
				}
			}
		}
	}
	
	public static void beschraenktIterativPostOrder(HashMap<String, Node> map, String s, String suche, int i) {
		
		Node start = map.get(s);
		for(String c : start.children) {
			Node n = map.get(c);
			for(String c2 : n.children) {
				Node n2 = map.get(c2);
				for(String c3 : n2.children) {
					Node n3 = map.get(c3);
					for(String c4 : n3.children) {
						Node n4 = map.get(c4);
						for(String c5 : n4.children) {
							Node n5 = map.get(c5);
							for(String c6 : n5.children) {
								Node n6 = map.get(c6);
								if(n6.content.contains(suche)) {
									result.add(n6);
								}
							}
							if(n5.content.contains(suche)) {
								result.add(n5);
							}
						}
						if(n4.content.contains(suche)) {
							result.add(n4);
						}
					}
					if(n3.content.contains(suche)) {
						result.add(n3);
					}
				}
				if(n2.content.contains(suche)) {
					result.add(n2);
				}
			}
			if(n.content.contains(suche)) {
				result.add(n);
			}
		}
		if(start.content.contains(suche)) {
			result.add(start);
		}
	}
	
	public static void nichtDeterministischIterativPreOrder(HashMap<String, Node> map, String s, String suche) {
		
		Node start = map.get(s);
		if(start.content.contains(suche)) {
			result.add(start);
		}
		ArrayList<String> children = start.children;
		Collections.shuffle(children);
		for(String c : children) {
			Node n = map.get(c);
			if(n.content.contains(suche)) {
				result.add(n);
			}
			ArrayList<String> children2 = n.children;
			Collections.shuffle(children2);
			for(String c2 : children2) {
				Node n2 = map.get(c2);
				if(n2.content.contains(suche)) {
					result.add(n2);
				}
				ArrayList<String> children3 = n2.children;
				Collections.shuffle(children3);
				for(String c3 : children3) {
					Node n3 = map.get(c3);
					if(n3.content.contains(suche)) {
						result.add(n3);
					}
					ArrayList<String> children4 = n3.children;
					Collections.shuffle(children4);
					for(String c4 : children4) {
						Node n4 = map.get(c4);
						if(n4.content.contains(suche)) {
							result.add(n4);
						}
						ArrayList<String> children5 = n4.children;
						Collections.shuffle(children5);
						for(String c5 : children5) {
							Node n5 = map.get(c5);
							if(n5.content.contains(suche)) {
								result.add(n5);
							}
							ArrayList<String> children6 = n5.children;
							Collections.shuffle(children6);
							for(String c6 : children6) {
								Node n6 = map.get(c6);
								if(n6.content.contains(suche)) {
									result.add(n6);
								}
								ArrayList<String> children7 = n6.children;
								Collections.shuffle(children7);
								for(String c7 : children7) {
									Node n7 = map.get(c7);
									if(n7.content.contains(suche)) {
										result.add(n7);
									}
									ArrayList<String> children8 = n7.children;
									Collections.shuffle(children8);
									for(String c8 : children8) {
										Node n8 = map.get(c8);
										if(n8.content.contains(suche)) {
											result.add(n8);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
	}
	
	public static void nichtDeterministischIterativPostOrder(HashMap<String, Node> map, String s, String suche) {
		
		Node start = map.get(s);
		ArrayList<String> children = start.children;
		Collections.shuffle(children);
		for(String c : children) {
			Node n = map.get(c);
			ArrayList<String> children2 = n.children;
			Collections.shuffle(children2);
			for(String c2 : children2) {
				Node n2 = map.get(c2);
				ArrayList<String> children3 = n2.children;
				Collections.shuffle(children3);
				for(String c3 : children3) {
					Node n3 = map.get(c3);
					ArrayList<String> children4 = n3.children;
					Collections.shuffle(children4);
					for(String c4 : children4) {
						Node n4 = map.get(c4);
						ArrayList<String> children5 = n4.children;
						Collections.shuffle(children5);
						for(String c5 : children5) {
							Node n5 = map.get(c5);
							ArrayList<String> children6 = n5.children;
							Collections.shuffle(children6);
							for(String c6 : children6) {
								Node n6 = map.get(c6);
								ArrayList<String> children7 = n6.children;
								Collections.shuffle(children7);
								for(String c7 : children7) {
									Node n7 = map.get(c7);
									ArrayList<String> children8 = n7.children;
									Collections.shuffle(children8);
									for(String c8 : children8) {
										Node n8 = map.get(c8);
										if(n8.content.contains(suche)) {
											result.add(n8);
										}
									}
									if(n7.content.contains(suche)) {
										result.add(n7);
									}
								}
								if(n6.content.contains(suche)) {
									result.add(n6);
								}
							}
							if(n5.content.contains(suche)) {
								result.add(n5);
							}
						}
						if(n4.content.contains(suche)) {
							result.add(n4);
						}
					}
					if(n3.content.contains(suche)) {
						result.add(n3);
					}
				}
				if(n2.content.contains(suche)) {
					result.add(n2);
				}
			}
			if(n.content.contains(suche)) {
				result.add(n);
			}
		}
		if(start.content.contains(suche)) {
			result.add(start);
		}
		
	}
	
	public static void nichtDeterministischRekursivPreOrder(HashMap<String, Node> map, String s, String suche) {
		
		Node start = map.get(s);
		Deque<Node> st = new ArrayDeque<>();
		st.push(start);
		nichtDeterministischRekursivPreOrder_alg(st, map, suche);
		
	}
	
	private static void nichtDeterministischRekursivPreOrder_alg(Deque<Node> s, HashMap<String, Node> map, String suche) {

		if(s.isEmpty())
			return;
		
		Node n = (Node) s.pop();
		if(n.content.contains(suche)) {
			result.add(n);
		}
		
		ArrayList<String> children = n.children;
		Collections.shuffle(n.children);
		for(String c : children) {
			s.push(map.get(c));
		}
		
		nichtDeterministischRekursivPreOrder_alg(s, map, suche);
		
	}
	
	public static void nichtDeterministischRekursivPostOrder(HashMap<String, Node> map, String s, String suche) {
		
		Node start = map.get(s);
		Deque<Node> st = new ArrayDeque<>();
		st.push(start);
		nichtDeterministischRekursivPostOrder_alg(st, map, suche);
		
	}
	
	private static void nichtDeterministischRekursivPostOrder_alg(Deque<Node> s, HashMap<String, Node> map, String suche) {

		if(s.isEmpty())
			return;
		
		Node n = (Node) s.pop();
		
		ArrayList<String> children = n.children;
		Collections.shuffle(n.children);
		for(String c : children) {
			s.push(map.get(c));
		}
		
		rekursivPostOrder_alg(s, map, suche);
		
		if(n.content.contains(suche)) {
			result.add(n);
		}
		
	}

}
