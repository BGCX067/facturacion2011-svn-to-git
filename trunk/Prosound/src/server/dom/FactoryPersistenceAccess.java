package server.dom;

import api.dom.Cambio;
import api.dom.Cliente;
import api.dom.Articulos;
import api.dom.Factura;
import api.dom.Gasto;
import api.dom.Lineas;
import api.dom.Pago;
import server.pers.BrokerCambioAccess;
import server.pers.BrokerClientesAccess;
import server.pers.BrokerArticulosAccess;
import server.pers.BrokerFacturasAccess;
import server.pers.BrokerGastosAccess;
import server.pers.BrokerLineasAccess;
import server.pers.BrokerPagosAccess;

/**
 * 
 * @author MAT
 */
public class FactoryPersistenceAccess extends FactoryPersistence {

    @Override
    public Broker createPersistence(api.dom.IPersistente objP) {
        if (objP.getClass() == Cliente.class) {
            return new BrokerClientesAccess((Cliente) objP);
        } else if (objP.getClass() == Articulos.class) {
            return new BrokerArticulosAccess((Articulos) objP);
        } else if (objP.getClass() == Factura.class) {
            return new BrokerFacturasAccess((Factura) objP);
        } else if (objP.getClass() == Cambio.class) {
            return new BrokerCambioAccess((Cambio) objP);
        } else if (objP.getClass() == Lineas.class) {
            return new BrokerLineasAccess((Lineas) objP);
        } else if (objP.getClass() == Gasto.class) {
            return new BrokerGastosAccess((Gasto) objP);
        } else if (objP.getClass() == Pago.class) {
            return new BrokerPagosAccess((Pago) objP);
        } else {
            return null;
        }
    }
}
