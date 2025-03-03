import { Link } from 'react-router-dom';
import { useCart } from '../context/CartContext';

const Navbar = () => {
  const { cart } = useCart();

  return (
    <nav className="bg-blue-500 p-4 text-white">
      <div className="container mx-auto flex justify-between items-center">
        <Link to="/" className="text-xl font-bold">
          E-Commerce App
        </Link>
        <Link to="/cart" className="text-lg">
          Cart ({cart.length})
        </Link>
      </div>
    </nav>
  );
};

export default Navbar;