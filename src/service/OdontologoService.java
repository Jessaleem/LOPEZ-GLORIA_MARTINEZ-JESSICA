package service;

import dao.OdontologoDaoH2;
import dao.iDao;
import model.Odontologo;

import java.util.List;

public class OdontologoService {
    private iDao<Odontologo> odontologoiDao;

    public OdontologoService() {
        odontologoiDao= new OdontologoDaoH2();
    }

    public Odontologo guardarOdontologo(Odontologo Odontologo){ return odontologoiDao.guardar(Odontologo); }
    public Odontologo buscarPorID(Integer id){ return odontologoiDao.buscarPorID(id);}
    public List<Odontologo> buscarTodos(){
        return odontologoiDao.buscarTodos();
    }
}
