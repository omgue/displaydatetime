import { render, screen } from '@testing-library/react';
import DateTimeInfoDisplay from './DateTimeInfoDisplay'

it("Test DateTimeInfoDisplay", () => {
    const display = render(<DateTimeInfoDisplay srv='2021-10-14, 23:10:00' loc='2021-10-14, 18:10:00' />);
    expect(display.getByTestId('srv')).toHaveTextContent('Server date time : 2021-10-14, 23:10:00');
    expect(display.getByTestId('loc')).toHaveTextContent('Local date time : 2021-10-14, 18:10:00');
});