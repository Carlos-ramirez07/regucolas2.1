package geometria;

import java.io.IOException;

public class cola_generica <T>{
	
	private Nodo<T> primero;
	private Nodo<T> ultimo;
	
	double valor=0, valor2 = 0, fig1 = 0, fig2 = 0, fig3 = 0, fig4 = 0, fig5 = 0, fig6 = 0, fig7 = 0;
	
	Cuadrado objCuadrado = new Cuadrado();
	Circulo objCirculo = new Circulo();
	Triangulo objTriangulo = new Triangulo();
	Rectangulo objRectangulo = new Rectangulo();
	Rombo objRombo=new Rombo();

//////////////////////////////////////////////////////////////////////////////////////////////////
	public cola_generica() {
		primero=null;
		ultimo=null;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////
	public void encolar(T x, int op, int cont) throws IOException{
		
		LeerDato objLeer =  new LeerDato();
		
		
		Nodo<T> nuevo = new Nodo(x,null);
		
		if (op != 2) {
			   valor =objLeer.leer(0);
		}else {
			valor =objLeer.leer(0);
			System.out.println("inserte el valor del lado mas largo");
			valor2 =objLeer.leer(0);
		}
		
		if (cont==1) {
		
			if (op == 1) {
				fig1 = objRombo.calcularPerimetro(valor);
			}else {
			
				if (op == 2) {
					fig1 = objRectangulo.calcularPerimetro(valor, valor2);
				}else {
				
					if (op == 3) {
						fig1 = objCuadrado.calcularPerimetro(valor);
					}else {
					
						if (op == 4) {
							fig1 = objCirculo.calcularPerimetro(valor);
						}else {
						
							if (op == 5) {
								fig1 = objTriangulo.calcularPerimetro(valor);
							}
						}
					}
				}
			}
		}else {
			if (cont==2) {
				
				if (op == 1) {
					fig2 = objRombo.calcularPerimetro(valor);
				}else {
				
					if (op == 2) {
						fig2 = objRectangulo.calcularPerimetro(valor, valor2);
					}else {
					
						if (op == 3) {
							fig2 = objCuadrado.calcularPerimetro(valor);
						}else {
						
							if (op == 4) {
								fig2 = objCirculo.calcularPerimetro(valor);
							}else {
							
								if (op == 5) {
									fig2 = objTriangulo.calcularPerimetro(valor);
								}
							}
						}
					}
				}
			} else {
				if (cont==3) {
					
					if (op == 1) {
						fig3 = objRombo.calcularPerimetro(valor);
					}else {
					
						if (op == 2) {
							fig3 = objRectangulo.calcularPerimetro(valor, valor2);
						}else {
						
							if (op == 3) {
								fig3 = objCuadrado.calcularPerimetro(valor);
							}else {
							
								if (op == 4) {
									fig3 = objCirculo.calcularPerimetro(valor);
								}else {
								
									if (op == 5) {
										fig3 = objTriangulo.calcularPerimetro(valor);
									}
								}
							}
						}
					}
				}else {
					if (cont==4) {
						
						if (op == 1) {
							fig4 = objRombo.calcularPerimetro(valor);
						}else {
						
							if (op == 2) {
								fig4 = objRectangulo.calcularPerimetro(valor, valor2);
							}else {
							
								if (op == 3) {
									fig4 = objCuadrado.calcularPerimetro(valor);
								}else {
								
									if (op == 4) {
										fig4 = objCirculo.calcularPerimetro(valor);
									}else {
									
										if (op == 5) {
											fig4 = objTriangulo.calcularPerimetro(valor);
										}
									}
								}
							}
						}
					}else {
						if (cont==5) {
							
							if (op == 1) {
								fig5 = objRombo.calcularPerimetro(valor);
							}else {
							
								if (op == 2) {
									fig5 = objRectangulo.calcularPerimetro(valor, valor2);
								}else {
								
									if (op == 3) {
										fig5 = objCuadrado.calcularPerimetro(valor);
									}else {
									
										if (op == 4) {
											fig5 = objCirculo.calcularPerimetro(valor);
										}else {
										
											if (op == 5) {
												fig5 = objTriangulo.calcularPerimetro(valor);
											}
										}
									}
								}
							}
						}else {
							if (cont==6) {
								
								if (op == 1) {
									fig6 = objRombo.calcularPerimetro(valor);
								}else {
								
									if (op == 2) {
										fig6 = objRectangulo.calcularPerimetro(valor, valor2);
									}else {
									
										if (op == 3) {
											fig6 = objCuadrado.calcularPerimetro(valor);
										}else {
										
											if (op == 4) {
												fig6 = objCirculo.calcularPerimetro(valor);
											}else {
											
												if (op == 5) {
													fig6 = objTriangulo.calcularPerimetro(valor);
												}
											}
										}
									}
								}
							}else {
								if (cont==7) {
									
									if (op == 1) {
										fig7 = objRombo.calcularPerimetro(valor);
									}else {
									
										if (op == 2) {
											fig7 = objRectangulo.calcularPerimetro(valor, valor2);
										}else {
										
											if (op == 3) {
												fig7 = objCuadrado.calcularPerimetro(valor);
											}else {
											
												if (op == 4) {
													fig7 = objCirculo.calcularPerimetro(valor);
												}else {
												
													if (op == 5) {
														fig7 = objTriangulo.calcularPerimetro(valor);
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
			}
		}
		
		
		if(primero==null) {
			
			primero=nuevo;
			} else{
				ultimo.setSiguiente(nuevo);
				}
		ultimo=nuevo;
		
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean esVacia(){
		if(primero ==null) {
			return true;
			}else {
				return false;
			}
		}
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void mostrar() throws IOException{
		Nodo<T> p=primero;
		int i = 0;
		while(p!=null){
			i++;
			if (i==1) {
				System.out.print(p.getInfo()+"------");
				System.out.println(fig1);
			}
			
			if (i==2) {
				System.out.print(p.getInfo()+"------");
				System.out.println(fig2);
			}
			
			if (i==3) {
				System.out.print(p.getInfo()+"------");
				System.out.println(fig3);
			}
			
			if (i==4) {
				System.out.print(p.getInfo()+"------");
				System.out.println(fig4);
			}
			
			if (i==5) {
				System.out.print(p.getInfo()+"------");
				System.out.println(fig5);
			}
			if (i==6) {
				System.out.print(p.getInfo()+"------");
				System.out.println(fig6);
			}
			
			if (i==7) {
				System.out.print(p.getInfo()+"------");
				System.out.println(fig7);
			}
			
			
			p=p.getSiguiente();
		}
	}

}
