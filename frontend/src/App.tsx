import NavBar from "components/NavBar";
import Footer from "components/Footer";
import DataTable from "components/DataTable";
import BarChart from "components/BarChart";
import DonutChart from "components/DonutChart";
import { Fragment } from "react";

function App() {
  return (
    <Fragment>
      <NavBar />
      <div className="container">
        <h2 className="text-primary py-3">Dashboard de Vendas</h2>
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secundary">Taxa de sucesso(%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secundary">Todas as Vendas</h5>
            <DonutChart />
          </div>
          <h2 className="text-primary py-3">Todas as Vendas</h2>
          <DataTable />
        </div>
      </div>
      <Footer />
    </Fragment>
  );
}

export default App;
