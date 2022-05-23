
public class MascotaVirtual {
		
		private String nombre;
		private int estatura;
		private int peso;
		private String color;
		private String poder;
		private boolean dormir;
		private boolean alimentar;
		private boolean jugar;
		private boolean descansar;
		private boolean hacerAmistades;
		private int cantidadAmigos;
		private int energia;
		private int alegria;
		private int vida;
		private boolean dead;

		
		
		public MascotaVirtual(String nombre, int estatura, int peso, String color, String poder) {
		
		
			this.nombre = nombre;
			this.estatura = estatura;
			this.peso = peso;
			this.color = color;
			this.poder = poder;
			this.dormir = false;
			this.alimentar = false;
			this.jugar = false;
			this.descansar = false;
			this.hacerAmistades = false;
			this.cantidadAmigos = 0;
			this.energia = 100;
			this.alegria = 100;
			this.vida = 100;
			this.dead = false;
			}
			public void duerma() {
				if(this.vida >0 && this.energia<20) {
					if(this.dormir == false) {
						System.out.println("Espi dormirá, y eso le encanta");
						this.dormir = true;
						this.energia = this.energia + 5;
						this.alegria = this.alegria + 10;
						this.vida = this.vida + 5;
						}
					else {
						System.out.println("Espi ya durmió,pero nunca es suficiente");
					}
					}
				else {
					System.out.println("Espi tiene mucha energía, parece que no quiere dormir");
				}
					}
			
			public void despierte() {
				if(this.energia>5 && this.vida>0) 
				{
					if(this.dormir==true) {
						System.out.println("Espi despertará lista para activarse");
						this.dormir = false;	
						}
					else {
						System.out.println("Espi está despierta, sólo que está distraída");
					}
					}
				else {
					System.out.println("Parece que Espi no quiere despertar, tiene poca energía");
				}
				}
			public void comer() {
				if(this.vida >0 && this.energia<100) {
					if (this.alimentar==false) {
						System.out.println("Que rico, a Espi le encanta comer"); 
						this.alimentar = true;
						this.energia = this.energia + 5;
						this.vida = this.vida + 10;
						this.alegria = this.alegria + 20;
							}
					else {
						System.out.println("Espi ya comió, por unos segundos está satisfecha");
						}
					
					}
				else {
					System.out.println("Espi está llena de energía, por ahora no necesita comer más");
						 
					 }
				 }
			public void satisfecha() {
				if(this.energia>50 && this.vida>0) {
					if(this.alimentar==true) {
						System.out.println("Por esta vez Espi no quiere comer");
						this.alimentar = false;
						this.vida = this.vida - 5;
					}
					else {
						System.out.println("Espi quiere comer más");
					}
				}
				else {
					System.out.println("Parece que Espi tiene poca energía, quiere seguir comiendo");
				}
			}
			
			public void jugar() {
				if(this.energia > 10 && this.vida>0) {		
					if(this.jugar == false) {
						System.out.println("Espi jugará, se divertirá demasiado, se pondrá muy alegre");
						this.jugar = true;
						this.energia = this.energia - 5;
						this.vida = this.vida + 2;
						this.alegria = this.alegria + 10;
						}
					else {
						System.out.println("Espi no jugará ahora");
						}
			}
				else {
					System.out.println("Espi tiene poca energía, no quiere jugar ahora");
				}
			}
			public void noJugar() {
				if(this.energia<10 || this.vida<=0) {
					if(this.jugar == true) {
						System.out.println("Espi no quiere jugar ahora");
						this.jugar = false;
						this.vida = this.vida - 6;
					}
					else {
						System.out.println("Espi está ansiosa por jugar");
					}
				}
				else {
					System.out.println("Espi tiene demasiada energía como para dejar de jugar");
				}
			}
			public void amistades() {
				if(this.vida>0 && this.energia>20) {
					if(this.hacerAmistades == false) {
						System.out.println("Espi está feliz de conocer a nuevas amistades");
						this.hacerAmistades = true;
						this.energia = this.energia + 20;
						this.alegria = this.alegria + 25;
						this.cantidadAmigos = this.cantidadAmigos + 1;
					}
					else {
						System.out.println("Espi necesita más energía para hacer amistades");
					}
				}
				else {
					System.out.println("Espi no tiene energía para hacer más amistades :(");
				}
				
			}
			public void noAmistades() {
				if(this.energia<10 || this.vida<=0 || this.cantidadAmigos>100) {
					if(this.hacerAmistades == true) {
						System.out.println("Espi tiene suficientes amigos, por ahora");
						this.hacerAmistades = false;
					}
					else {
						System.out.println("Espi quiere tener más amigos");
					}
				}
				else {
					System.out.println("Espi tiene mucha energía, quiere más amistades");
				}
			}
			public void descanso() {
				if(this.energia<20 &&this.vida>0) {
					if(this.descansar == false) {
						System.out.println("A Espi le encanta descansar, ya sea leyendo,jugando play o viendo televisión");
						this.descansar= true;
						this.energia = this.energia + 30;
						this.alegria = this.alegria + 10;
						this.vida = this.vida + 2;
					}
					else {
						System.out.println("Espi ya ha descansado demasiado");
					}
				}
				else {
					System.out.println("Espi tiene mucha energía, no quiere descansar");
				}
			}
			public void noDescanso() {
				if(this.energia>60 || this.vida<=0) {
					if(this.descansar==true) {
						System.out.println("Justo Espi no quería más descanso, por ahora");
						this.descansar = false;
						this.vida = this.vida -4;
					}
					else {
						System.out.println("Espi desea descansar más");
					}
				}
				else {
					System.out.println("Espi tiene poca energía, déjala descansar un ratito más");
				}
			}
			public void morir() {
				if(this.vida==0) {
					System.out.println("Espi ya no vive, faltó cuidarla más");
					this.dead=true;					
				}
			}
			
	
			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public int getEstatura() {
				return estatura;
			}

			public void setEstatura(int estatura) {
				this.estatura = estatura;
			}

			public int getPeso() {
				return peso;
			}

			public void setPeso(int peso) {
				this.peso = peso;
			}

			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public String getPoder() {
				return poder;
			}

			public void setPoder(String poder) {
				this.poder = poder;
			}

			public boolean isDormir() {
				return dormir;
			}

			public void setDormir(boolean dormir) {
				this.dormir = dormir;
			}

			public boolean isAlimentar() {
				return alimentar;
			}

			public void setAlimentar(boolean alimentar) {
				this.alimentar = alimentar;
			}

			public boolean isJugar() {
				return jugar;
			}

			public void setJugar(boolean jugar) {
				this.jugar = jugar;
			}

			public boolean isDescansar() {
				return descansar;
			}

			public void setDescansar(boolean descansar) {
				this.descansar = descansar;
			}

			public boolean isHacerAmistades() {
				return hacerAmistades;
			}

			public void setHacerAmistades(boolean hacerAmistades) {
				this.hacerAmistades = hacerAmistades;
			}

			public int getCantidadAmigos() {
				return cantidadAmigos;
			}

			public void setCantidadAmigos(int cantidadAmigos) {
				this.cantidadAmigos = cantidadAmigos;
			}

			public int getEnergia() {
				return energia;
			}

			public void setEnergia(int energia) {
				this.energia = energia;
			}

			public int getAlegria() {
				return alegria;
			}

			public void setAlegria(int alegria) {
				this.alegria = alegria;
			}
				
			}


