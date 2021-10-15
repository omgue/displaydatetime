import React from 'react';

function DateTimeInfoDisplay({srv, loc}){ 
    return <div>
        <div data-testid="srv">Server date time : {srv}</div>
        <div data-testid="loc">Local date time : {loc}</div> 
    </div>
};

export default DateTimeInfoDisplay;