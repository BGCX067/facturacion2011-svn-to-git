package tsl_nacha.persistencia;

import tsl_nacha.broker.BrokerArticulosAccess;
import tsl_nacha.broker.BrokerCambioAccess;
import tsl_nacha.broker.BrokerCategoriasAccess;
import tsl_nacha.broker.BrokerClientesAccess;
import tsl_nacha.broker.BrokerCuentasAccess;
import tsl_nacha.broker.BrokerFacturasAccess;
import tsl_nacha.broker.BrokerLineasAccess;
import tsl_nacha.broker.BrokerPagosAccess;
import tsl_nacha.dominio.Articulos;
import tsl_nacha.dominio.Cambio;
import tsl_nacha.dominio.Categorias;
import tsl_nacha.dominio.Clientes;
import tsl_nacha.dominio.Cuentas;
import tsl_nacha.dominio.Facturas;
import tsl_nacha.dominio.Lineas;
import tsl_nacha.dominio.Pagos;



/**
 * 
 * @author MAT
 */
public class FactoryPersistenceAccess extends FactoryPersistence {

    @Override
    public Broker createPersistence(tsl_nacha.dominio.IPersistente objP) {
        if (objP.getClass() == Categorias.class) {
            return new BrokerCategoriasAccess((Categorias) objP);
        } else if (objP.getClass() == Articulos.class) {
            return new BrokerArticulosAccess((Articulos) objP);
        }else if (objP.getClass() == Clientes.class) {
            return new BrokerClientesAccess((Clientes) objP);
        }else if (objP.getClass() == Facturas.class) {
            return new BrokerFacturasAccess((Facturas) objP);
        }else if (objP.getClass() ==Lineas.class) {
            return new BrokerLineasAccess((Lineas) objP);
        }else if (objP.getClass() ==Cuentas.class) {
            return new BrokerCuentasAccess((Cuentas) objP);
        }else if (objP.getClass() ==Pagos.class) {
            return new BrokerPagosAccess((Pagos) objP);
        }else if (objP.getClass() ==Cambio.class) {
            return new BrokerCambioAccess((Cambio) objP);
        }
        /*} else if (objP.getClass() == Funcionarios.class) {
            return new BrokerFuncionariosAccess((Funcionarios) objP);
        } else if (objP.getClass() == PuntosHabilitados.class) {
            return new BrokerPuntosHabilitadosAcces((PuntosHabilitados) objP);
        } else if (objP.getClass() == Tickets.class) {
            return new BrokerTicketsAccess((Tickets) objP);
        */ else {
            return null;
        }
    }
}
