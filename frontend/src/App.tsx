import Navbar from "components/navbar";
import Footer from "components/footer"
import DataTable from "components/DataTable";
import BarChart from "components/BarChart";
import DonutChart from "components/DonutChat";

function App() {
  return (
    <>
    <Navbar />
    <div className="App">
      <h1 className="primary-text py-3"> Dashboard de  Vendas </h1>
    </div>
    <div className="row px-3">
      <div col-sm-6>
        <h5 className="text-center text-secondary">Todas as Vendas</h5>
        <BarChart />
      </div>
      <div col-sm-6>
        <h5 className="text-center text-secondary">Taxa de Sucesso</h5>
        <DonutChart />
      </div>
      <div className="py-3">
        <h2 className="text-primary"> Todas as Vendas </h2>
      </div>
      <DataTable />
    </div>
    <Footer />
  </>
  );
}
export default App;
