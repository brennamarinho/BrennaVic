public int qtsDeReservasPorAtracao(long idAtracao) throws AtracaoInexistenteException {
    int quantidade = 0;
    for(ReservaHorario reserva:this.reservas) {
        if(reserva.getId() == idAtracao()) {
            quantidade++;
        }
    }
    return quantidade++;
}

public void realizarReserva(Pessoa p, Atracao a, int horarioInicial, int horarioFinal) {
    throws AtracaoLotadaException,AtracaoInexistenteException,IdadeInsuficienteException, ReservaExistenteException {
        if(p!=null && a!=null) {
            if (a.getIdade() >= a.getIdadeMinima()) {
                if (this.repositorio.qtdDeRservasPorAtracao(a.getId() < a.getCapacidadeMax()) {
                    long idRandomico = new Random().nextlong() * 10000000;
                    ReservaHorario r = new ReservaHorario(id Randomico, Pessoa p, Atracao a, int horarioInicial,
                    int horarioFinal)
                    this.repositorio.adicionaReserva(r);
                } else {
                   throw new IdadeInsuficienteException(a);
            }
        } else {
            throw new AtracaoLotadaException();
        }
    }
}

public void adicionarReserva(ReservaHorario reserva) throws ReservaExistenteException {

      for(ReservaHorario r: this.reservas) {
        if(r.getId() == reserva.getId()) {
            throw new ReservaExistenteException();
        }
        }
        this.reservas.add(reserva);
    }

public void removerReserva(long idReserva) throws ReservaInexistenteException {
       ReservaHorario encontrada = null;

       for(ReservaHorario r: this.reservas) {
           if(r.getId() == idReserva) {
               encontrada = r;
               break
           }
       }
       if(encontrada == null) {
           throw new ReservaInexistente Exception();
       }
       this.reservas.remove(encontrada);


public void adicionarApto(Apartamento apto, int andar) {
    throws  AndarInexistenteException, NumMaximoAptosAlcancadosException {
        if(andar<0 || andar >= this.aptos.length) {
            throw new AndarInexistenteException(andar);
        }
        if(andar>=1 && this.aptos[andar-1][0]== null ) {
            throw new AndarInexistenteException(andar);
        }
        boolean achei = false;
        for(i>0; i< aptos[andar].length && !achei; i++) {
                    if(this.aptos[andar][i]==null) {
                        this.aptos[andar][i] ==apto;
                        achei = true;
                    }
                }
        if(!achei) {
            throw new NumMaximoAptosAlcancadosException();
            }
        }










Método codigoA
Método codigoB
Exceção de runtime capturada: class java.lang ArrayIndexOutOfBoundsException
Minha exceção levantada. Valor: 77
Minha exceção levantada. Valor:88





public void adicionarApto(Apartamento apto, int andar) throws AndarInexistenteException,NumMaximoAptosAlcancadoException {

        if(andar<0 || andar >= this.aptos.length) {
            throw AndarInexistenteException(andar);
        }
        if(andar>=1 && this.aptos[andar-1][0]==null) {
            throw AndarInexistenteException(andar);
        }
        boolean achei=false;
        for(i=0; i< apto[andar].length && !achei; i++) {
            if(this.aptos[andar][i]==null) {
                this.aptos[andar][i] = apto;
                achei=true;
            }
        }
        if(!achei) {
            throw new NumMaximoAptosAlcancadoException;
        }
    }

public int qtdDeReservasPorAtracao(long idAtracao) throws AtracaoInexistenteException {
        int resultado = 0;
        for(ReservaHorario reserva: this.reservas) {
            if(reserva.getId() == idAtracao()) {
                resultado++;
            }
        }
        return resultado;
            }


public void realizarReserva(Pessoa p, Atracao a, int horarioInicial. int horarioFinal)
        throws IdadeInsuficienteException, AtracaoLotadaException, ReservaExistenteException, AtracaoInexistenteException {

        if(p!=null && a!= null) {
            if(p.getIdade()>=a.getIdadeMinima()) {
                if(this.repositorio.qtdDeReservasPorAtracao(a.getId()<=a.getCapacidadeMax()) {
                    long idRandomico = new Random().nextLong() * 10000000;
                    ReservaHorario novaReserva = new ReservaHorario(id Randomico, p,a ,horarioInicial, horarioFinal);
                    this.repositorio.adicionarReserva(novaReserva);
                } else {
                throw new AtracaoLotadaException();
            }
            }else {
                throw new IdadeInsuficienteException();
        }
                }
            }















































































