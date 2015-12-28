package server.dom;

import api.dom.Cambio;
import api.dom.Camion;
import api.dom.Cliente;
import api.dom.Empleado;
import api.dom.Factura;
import api.dom.Gasto;
import api.dom.Pago;
import api.dom.Sueldo;
import server.pers.BrokerCambioAccess;
import server.pers.BrokerCamionesAccess;
import server.pers.BrokerClientesAccess;
import server.pers.BrokerEmpleadosAccess;
import server.pers.BrokerFacturasAccess;
import server.pers.BrokerGastosAccess;
import server.pers.BrokerPagosAccess;
import server.pers.BrokerSueldosAccess;

/**
 * 
 * @author MAT
 */
public class FactoryPersistenceAccess extends FactoryPersistence {

    @Override
    public Broker createPersistence(api.dom.IPersistente objP) {
        if (objP.getClass() == Cliente.class) {
            return new BrokerClientesAccess((Cliente) objP);
        } else if (objP.getClass() == Empleado.class) {
            return new BrokerEmpleadosAccess((Empleado) objP);
        } else if (objP.getClass() == Camion.class) {
            return new BrokerCamionesAccess((Camion) objP);
        } else if (objP.getClass() == Pago.class) {
            return new BrokerPagosAccess((Pago) objP);
        } else if (objP.getClass() == Sueldo.class) {
            return new BrokerSueldosAccess((Sueldo) objP);
        } else if (objP.getClass() == Gasto.class) {
            return new BrokerGastosAccess((Gasto) objP);
        } else if (objP.getClass() == Factura.class) {
            return new BrokerFacturasAccess((Factura) objP);
        } else if (objP.getClass() == Cambio.class) {
            return new BrokerCambioAccess((Cambio) objP);
        } else {
            return null;
        }
    }
}
