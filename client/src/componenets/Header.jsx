import { AppBar, Toolbar, colors, styled } from '@mui/material';
import {Link} from 'react-router-dom';
import { routhPath } from '../routes/route';

const StyledAppBar = styled(AppBar)({
    background: '#2d2d2d',
    height: 64,
    '& > div > *': {
        textDecoration: 'none',
        color: 'inherit',
        marginRight: 20,
        fontSize: 14
    }
});

const Header = () => {
    const logo = "https://get-staffed.com/wp-content/uploads/2020/07/indeed-logo.png";
    return (
        <StyledAppBar>
            <Toolbar>
                <Link to = {routhPath.home}>
                <img src={logo} alt="logo" style={{ width: 95, marginBottom: 6 }} />
                </Link>
                {/* <div style={{ marginLeft: 'auto' }}> */}
                    <Link to={routhPath.create}>
                    Post a job
                    </Link>
                    <Link to = {routhPath.posts}>
                    Find Jobs
                    </Link>
                {/* </div> */}
            </Toolbar>
        </StyledAppBar>
    );
}

export default Header;
