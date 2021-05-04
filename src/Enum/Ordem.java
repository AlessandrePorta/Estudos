package Enum;

import java.util.Date;

public class Ordem {

    private Integer id;
    private Date data;
    private StatusOrdem status;

    public Ordem(){
    }

    public Ordem(Integer id, Date data, StatusOrdem status) {
        this.id = id;
        this.data = data;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public StatusOrdem getStatus() {
        return status;
    }

    public void setStatus(StatusOrdem status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ordem{" +
                "id=" + id +
                ", data=" + data +
                ", status=" + status +
                '}';
    }
}
