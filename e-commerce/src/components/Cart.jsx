import { useCart } from '../context/CartContext';

const Cart = () => {
  const { cart, removeFromCart } = useCart();

  const totalPrice = cart.reduce((total, item) => total + item.price, 0);

  return (
    <div>
      <h2 className="text-2xl font-bold mb-4">Your Cart</h2>
      {cart.map((item) => (
        <div key={item.id} className="border p-4 mb-2 rounded-lg flex justify-between items-center">
          <div>
            <h3 className="text-xl">{item.name}</h3>
            <p className="text-gray-600">${item.price}</p>
          </div>
          <button
            onClick={() => removeFromCart(item)}
            className="bg-red-500 text-white px-4 py-2 rounded"
          >
            Remove
          </button>
        </div>
      ))}
      <div className="mt-4">
        <p className="text-xl font-bold">Total: ${totalPrice.toFixed(2)}</p>
      </div>
    </div>
  );
};

export default Cart;