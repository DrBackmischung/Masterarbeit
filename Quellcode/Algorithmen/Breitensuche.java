package com.sap.mathisneunzig.algorithms;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Queue;

import com.sap.mathisneunzig.tree.List2TreeByParents;
import com.sap.mathisneunzig.tree.Node;

public class Breitensuche {
	
	static ArrayList<Node> result = new ArrayList<>();
	
	public static void main(String[] args) {

		System.out.println();
		System.out.println("=====================[BFS (iterativ)]=====================");
		System.out.println();
		HashMap<String, Node> map = List2TreeByParents.getMapMiddle();
		result = new ArrayList<>();
		iterativ(map, "SB_CFD_PRJ_PROJECT_V4", "cfd_dummy");
		System.out.println();
		System.out.println("=====================[ResultSet BFS (iterativ)]=====================");
		System.out.println();
		for(Node s : result) {
			System.out.println(s.id +" (DB: "+s.parentId+")");
		}

		System.out.println();
		System.out.println("=====================[BFS (beschränkt, iterativ)]=====================");
		System.out.println();
		map = List2TreeByParents.getMapMiddle();
		result = new ArrayList<>();
		beschraenktIterativ(map, "SB_CFD_PRJ_PROJECT_V4", "cfd_dummy");
		System.out.println();
		System.out.println("=====================[ResultSet BFS (beschränkt, iterativ)]=====================");
		System.out.println();
		for(Node s : result) {
			System.out.println(s.id +" (DB: "+s.parentId+")");
		}

		System.out.println();
		System.out.println("=====================[BFS (nicht-deterministisch, iterativ)]=====================");
		System.out.println();
		map = List2TreeByParents.getMapMiddle();
		result = new ArrayList<>();
		nichtDeterministischIterativ(map, "SB_CFD_PRJ_PROJECT_V4", "cfd_dummy");
		System.out.println();
		System.out.println("=====================[ResultSet BFS (nicht-deterministisch, iterativ)]=====================");
		System.out.println();
		for(Node s : result) {
			System.out.println(s.id +" (DB: "+s.parentId+")");
		}

		System.out.println();
		System.out.println("=====================[BFS (rekursiv)]=====================");
		System.out.println();
		map = List2TreeByParents.getMapMiddle();
		result = new ArrayList<>();
		rekursiv(map, "SB_CFD_PRJ_PROJECT_V4", "cfd_dummy");
		System.out.println();
		System.out.println("=====================[ResultSet BFS (rekursiv)]=====================");
		System.out.println();
		for(Node s : result) {
			System.out.println(s.id +" (DB: "+s.parentId+")");
		}

		System.out.println();
		System.out.println("=====================[BFS (nicht-deterministisch, rekursiv)]=====================");
		System.out.println();
		map = List2TreeByParents.getMapMiddle();
		result = new ArrayList<>();
		nichtDeterministischRekursiv(map, "SB_CFD_PRJ_PROJECT_V4", "cfd_dummy");
		System.out.println();
		System.out.println("=====================[ResultSet BFS (nicht-deterministisch, rekursiv)]=====================");
		System.out.println();
		for(Node s : result) {
			System.out.println(s.id +" (DB: "+s.parentId+")");
		}
		
	}
	
	public static void iterativ(HashMap<String, Node> map, String s, String suche) {
		
		Node start = map.get(s);
		if(start.content.contains(suche)) {
			result.add(start);
		}
		for(String c : start.children) {
			Node n = map.get(c);
			if(n.content.contains(suche)) {
				result.add(n);
			}
		}
		for(String c : start.children) {
			Node n = map.get(c);
			for(String c2 : n.children) {
				Node n2 = map.get(c2);
				if(n2.content.contains(suche)) {
					result.add(n2);
				}
			}
		}
		for(String c : start.children) {
			Node n = map.get(c);
			for(String c2 : n.children) {
				Node n2 = map.get(c2);
				for(String c3 : n2.children) {
					Node n3 = map.get(c3);
					if(n3.content.contains(suche)) {
						result.add(n3);
					}
				}
			}
		}
		for(String c : start.children) {
			Node n = map.get(c);
			for(String c2 : n.children) {
				Node n2 = map.get(c2);
				for(String c3 : n2.children) {
					Node n3 = map.get(c3);
					for(String c4 : n3.children) {
						Node n4 = map.get(c4);
						if(n4.content.contains(suche)) {
							result.add(n4);
						}
					}
				}
			}
		}
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
							if(n5.content.contains(suche)) {
								result.add(n5);
							}
						}
					}
				}
			}
		}

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
						}
					}
				}
			}
		}

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
									if(n7.content.contains(suche)) {
										result.add(n7);
									}
								}
							}
						}
					}
				}
			}
		}

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
								}
							}
						}
					}
				}
			}
		}
		
	}
	
	public static void beschraenktIterativ(HashMap<String, Node> map, String s, String suche) {
		
		Node start = map.get(s);
		if(start.content.contains(suche)) {
			result.add(start);
		}
		for(String c : start.children) {
			Node n = map.get(c);
			if(n.content.contains(suche)) {
				result.add(n);
			}
		}
		for(String c : start.children) {
			Node n = map.get(c);
			for(String c2 : n.children) {
				Node n2 = map.get(c2);
				if(n2.content.contains(suche)) {
					result.add(n2);
				}
			}
		}
		for(String c : start.children) {
			Node n = map.get(c);
			for(String c2 : n.children) {
				Node n2 = map.get(c2);
				for(String c3 : n2.children) {
					Node n3 = map.get(c3);
					if(n3.content.contains(suche)) {
						result.add(n3);
					}
				}
			}
		}
		for(String c : start.children) {
			Node n = map.get(c);
			for(String c2 : n.children) {
				Node n2 = map.get(c2);
				for(String c3 : n2.children) {
					Node n3 = map.get(c3);
					for(String c4 : n3.children) {
						Node n4 = map.get(c4);
						if(n4.content.contains(suche)) {
							result.add(n4);
						}
					}
				}
			}
		}
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
							if(n5.content.contains(suche)) {
								result.add(n5);
							}
						}
					}
				}
			}
		}

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
						}
					}
				}
			}
		}
		
	}
	
	public static void nichtDeterministischIterativ(HashMap<String, Node> map, String s, String suche) {
		
		ArrayList<String> children = new ArrayList<String>(),
				children2 = new ArrayList<String>(),
				children3 = new ArrayList<String>(),
				children4 = new ArrayList<String>(),
				children5 = new ArrayList<String>(),
				children6 = new ArrayList<String>(),
				children7 = new ArrayList<String>(),
				children8 = new ArrayList<String>();
		
		Node start = map.get(s);
		if(start.content.contains(suche)) {
			result.add(start);
		}
		children = start.children;
		Collections.shuffle(children);
		for(String c : children) {
			Node n = map.get(c);
			if(n.content.contains(suche)) {
				result.add(n);
			}
		}

		children = start.children;
		Collections.shuffle(children);
		for(String c : children) {
			Node n = map.get(c);
			children2 = n.children;
			Collections.shuffle(children2);
			for(String c2 : children2) {
				Node n2 = map.get(c2);
				if(n2.content.contains(suche)) {
					result.add(n2);
				}
			}
		}

		children = start.children;
		Collections.shuffle(children);
		for(String c : children) {
			Node n = map.get(c);
			children2 = n.children;
			Collections.shuffle(children2);
			for(String c2 : children2) {
				Node n2 = map.get(c2);
				children3 = n2.children;
				Collections.shuffle(children3);
				for(String c3 : children3) {
					Node n3 = map.get(c3);
					if(n3.content.contains(suche)) {
						result.add(n3);
					}
				}
			}
		}

		children = start.children;
		Collections.shuffle(children);
		for(String c : children) {
			Node n = map.get(c);
			children2 = n.children;
			Collections.shuffle(children2);
			for(String c2 : children2) {
				Node n2 = map.get(c2);
				children3 = n2.children;
				Collections.shuffle(children3);
				for(String c3 : children3) {
					Node n3 = map.get(c3);
					children4 = n3.children;
					Collections.shuffle(children4);
					for(String c4 : children4) {
						Node n4 = map.get(c4);
						if(n4.content.contains(suche)) {
							result.add(n4);
						}
					}
				}
			}
		}

		children = start.children;
		Collections.shuffle(children);
		for(String c : children) {
			Node n = map.get(c);
			children2 = n.children;
			Collections.shuffle(children2);
			for(String c2 : children2) {
				Node n2 = map.get(c2);
				children3 = n2.children;
				Collections.shuffle(children3);
				for(String c3 : children3) {
					Node n3 = map.get(c3);
					children4 = n3.children;
					Collections.shuffle(children4);
					for(String c4 : children4) {
						Node n4 = map.get(c4);
						children5 = n4.children;
						Collections.shuffle(children5);
						for(String c5 : children5) {
							Node n5 = map.get(c5);
							if(n5.content.contains(suche)) {
								result.add(n5);
							}
						}
					}
				}
			}
		}

		children = start.children;
		Collections.shuffle(children);
		for(String c : children) {
			Node n = map.get(c);
			children2 = n.children;
			Collections.shuffle(children2);
			for(String c2 : children2) {
				Node n2 = map.get(c2);
				children3 = n2.children;
				Collections.shuffle(children3);
				for(String c3 : children3) {
					Node n3 = map.get(c3);
					children4 = n3.children;
					Collections.shuffle(children4);
					for(String c4 : children4) {
						Node n4 = map.get(c4);
						children5 = n4.children;
						Collections.shuffle(children5);
						for(String c5 : children5) {
							Node n5 = map.get(c5);
							children6 = n5.children;
							Collections.shuffle(children6);
							for(String c6 : children6) {
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

		children = start.children;
		Collections.shuffle(children);
		for(String c : children) {
			Node n = map.get(c);
			children2 = n.children;
			Collections.shuffle(children2);
			for(String c2 : children2) {
				Node n2 = map.get(c2);
				children3 = n2.children;
				Collections.shuffle(children3);
				for(String c3 : children3) {
					Node n3 = map.get(c3);
					children4 = n3.children;
					Collections.shuffle(children4);
					for(String c4 : children4) {
						Node n4 = map.get(c4);
						children5 = n4.children;
						Collections.shuffle(children5);
						for(String c5 : children5) {
							Node n5 = map.get(c5);
							children6 = n5.children;
							Collections.shuffle(children6);
							for(String c6 : children6) {
								Node n6 = map.get(c6);
								children7 = n6.children;
								Collections.shuffle(children7);
								for(String c7 : children7) {
									Node n7 = map.get(c7);
									if(n7.content.contains(suche)) {
										result.add(n7);
									}
								}
							}
						}
					}
				}
			}
		}

		children = start.children;
		Collections.shuffle(children);
		for(String c : children) {
			Node n = map.get(c);
			children2 = n.children;
			Collections.shuffle(children8);
			for(String c2 : children2) {
				Node n2 = map.get(c2);
				children3 = n2.children;
				Collections.shuffle(children8);
				for(String c3 : children3) {
					Node n3 = map.get(c3);
					children4 = n3.children;
					Collections.shuffle(children8);
					for(String c4 : children4) {
						Node n4 = map.get(c4);
						children5 = n4.children;
						Collections.shuffle(children8);
						for(String c5 : children5) {
							Node n5 = map.get(c5);
							children6 = n5.children;
							Collections.shuffle(children8);
							for(String c6 : children6) {
								Node n6 = map.get(c6);
								children7 = n6.children;
								Collections.shuffle(children8);
								for(String c7 : children7) {
									Node n7 = map.get(c7);
									children8 = n7.children;
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
	
	public static void rekursiv(HashMap<String, Node> map, String s, String suche) {
		
		Node start = map.get(s);
		Queue<Node> q = new ArrayDeque<>();
		q.offer(start);
		rekursiv_alg(q, map, suche);
		
	}
	
	private static void rekursiv_alg(Queue<Node> q, HashMap<String, Node> map, String suche) {

		if(q.isEmpty())
			return;
		
		Node n = (Node) q.poll();
		if(n.content.contains(suche)) {
			result.add(n);
		}
		for(String c : n.children) {
			q.offer(map.get(c));
		}
		
		rekursiv_alg(q, map, suche);
		
	}
	
	public static void nichtDeterministischRekursiv(HashMap<String, Node> map, String s, String suche) {
		
		Node start = map.get(s);
		Queue<Node> q = new ArrayDeque<>();
		q.offer(start);
		nichtDeterministischRekursiv_alg(q, map, suche);
		
	}
	
	private static void nichtDeterministischRekursiv_alg(Queue<Node> q, HashMap<String, Node> map, String suche) {

		if(q.isEmpty())
			return;
		
		Node n = (Node) q.poll();
		if(n.content.contains(suche)) {
			result.add(n);
		}
		ArrayList<String> children = n.children;
		Collections.shuffle(children);
		for(String c : children) {
			q.offer(map.get(c));
		}
		
		nichtDeterministischRekursiv_alg(q, map, suche);
		
	}

}
