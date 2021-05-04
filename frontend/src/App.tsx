import NavBar from "components/NavBar";
import Footer from "components/Footer";
import DataTable from "components/DataTable";
import { Fragment } from "react";

function App() {
  return (
    <Fragment>
      <NavBar />
      <div className="container">
        <h2 className="text-primary">Olá Mundo!</h2>
        <DataTable/>
      </div>
      <Footer />
    </Fragment>
  );
}

export default App;
