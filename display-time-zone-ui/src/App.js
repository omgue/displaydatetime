import React, {Component} from 'react';
import './App.css';
import axios from 'axios';
import 'moment-timezone';
import moment from 'moment';
import DateTimeInfoDisplay from './components/DateTimeInfoDisplay';

class App extends Component {

  state = {serverDateTime: null, localDateTime: null};

  componentDidMount() {
      const url = 'http://localhost:8080/api/date-time-info';
      axios.get(url).then(response => {
        var zonedDateTime = response.data.zonedDateTime;
        var zoneId = response.data.zoneId;
        this.setState({serverDateTime: moment(zonedDateTime).tz(zoneId).format('yyyy-MM-DD, HH:mm:ss')});
        this.setState({localDateTime: moment(zonedDateTime).format('yyyy-MM-DD, HH:mm:ss') });
      }).catch(error => {
          console.log(error);
      });
  }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <DateTimeInfoDisplay srv={this.state.serverDateTime} loc={this.state.localDateTime} />
        </header>
      </div>
    );
  }
}

export default App;
